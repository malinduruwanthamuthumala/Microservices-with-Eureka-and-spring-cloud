package com.stayInMicroservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyExchange {
	
	@Id
	private Long ID;
	
	private String convertfrom;
	private String convertto;
	private BigDecimal conversionMultiple;
	private String environment;
	
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	
	public String getConvertfrom() {
		return convertfrom;
	}
	public void setConvertfrom(String convertfrom) {
		this.convertfrom = convertfrom;
	}
	public String getConvertto() {
		return convertto;
	}
	public void setConvertto(String convertto) {
		this.convertto = convertto;
	}
	public void setTo(String to) {
		this.convertto = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public CurrencyExchange(Long iD, String from, String to, BigDecimal conversionMultiple) {
		super();
		ID = iD;
		this.convertfrom = from;
		this.convertto = to;
		this.conversionMultiple = conversionMultiple;
	}
	
	public CurrencyExchange() {
		
	}

}
