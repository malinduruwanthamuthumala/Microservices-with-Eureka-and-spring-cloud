package com.stayInMicroservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;


@Component
@FeignClient(name="currency-exchange")
public interface CurrencyExchangeProxy {
	
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange calculateCurrencyConversion(
			@PathVariable String from,
			@PathVariable String to) ;
		
	
}
