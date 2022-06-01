package com.stayInMicroservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long>{
	
	
	
	CurrencyExchange findByConvertfromAndConvertto(String convertfrom,String convertto);

}
