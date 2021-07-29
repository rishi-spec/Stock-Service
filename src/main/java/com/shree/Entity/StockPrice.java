package com.shree.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name  ="STOCK_PRICE")
@Data
public class StockPrice {
	@Id
	@Column(name  = "Company_Id")
	private  String companyId;
	@Column(name  = "Company_Name")
	private String companyName;
	@Column(name  = "Company_Price")
	private  Double companyPrice;

}
