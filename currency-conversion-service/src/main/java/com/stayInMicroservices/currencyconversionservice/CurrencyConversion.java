package com.stayInMicroservices.currencyconversionservice;

import java.math.BigDecimal;

import javax.persistence.Id;

public class CurrencyConversion {


	private Long ID;
	
	private String convertfrom;
	private String convertto;
	private BigDecimal conversionMultiple;
	private String environment;
	private BigDecimal quantity;
	private BigDecimal total;
	
	public CurrencyConversion() {
		
	}
	public CurrencyConversion(Long iD, String convertfrom, String convertto, BigDecimal conversionMultiple,
			String environment, BigDecimal quantity, BigDecimal total) {
		super();
		this.ID = iD;
		this.convertfrom = convertfrom;
		this.convertto = convertto;
		this.conversionMultiple = conversionMultiple;
		this.environment = environment;
		this.quantity = quantity;

		this.total = total;
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
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
}
