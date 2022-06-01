package com.stayInMicroservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment env;
	
	@Autowired
	CurrencyExchangeRepository repo;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeRate(
			@PathVariable String from,
			@PathVariable String to) {
				
		
		CurrencyExchange ce= repo.findByConvertfromAndConvertto(from, to);
		
		ce.setEnvironment(env.getProperty("local.server.port"));
		return ce;
	}
}
