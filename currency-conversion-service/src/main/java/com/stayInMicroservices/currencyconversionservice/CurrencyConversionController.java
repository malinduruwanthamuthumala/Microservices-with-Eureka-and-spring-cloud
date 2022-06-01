package com.stayInMicroservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeProxy proxy;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversion(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable String quantity) {
		
		HashMap<String,String> uriVariable = new HashMap<>();
		uriVariable.put("from",from);
		uriVariable.put("to",to);
		
		ResponseEntity<CurrencyExchange>  responseEntity  = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",CurrencyExchange.class,uriVariable);
		CurrencyExchange curencyconvertion = responseEntity.getBody();
		
		return new CurrencyConversion(curencyconvertion.getID(),curencyconvertion.getConvertfrom(),curencyconvertion.getConvertto(),BigDecimal.valueOf(12),curencyconvertion.getEnvironment(),curencyconvertion.getConversionMultiple(),curencyconvertion.getConversionMultiple().multiply(BigDecimal.valueOf(2)));
		
	}
	
	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversionFeign(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable String quantity) {
		

		CurrencyExchange curencyconvertion = proxy.calculateCurrencyConversion(from, to);
		
		return new CurrencyConversion(curencyconvertion.getID(),curencyconvertion.getConvertfrom(),curencyconvertion.getConvertto(),BigDecimal.valueOf(12),curencyconvertion.getEnvironment(),curencyconvertion.getConversionMultiple(),curencyconvertion.getConversionMultiple().multiply(BigDecimal.valueOf(2)));
		
	}
}
