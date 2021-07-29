package com.shree.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shree.Entity.StockPrice;
import com.shree.service.StockPriceService;


@RestController
public class StrockPriceController {
	
	
	@Autowired
	private StockPriceService stockservice;
	
	@GetMapping("/stockprice/{name}")
public Double stockprice(@PathVariable("name") String companyName){
		
		StockPrice price = stockservice.getStockPrice(companyName);
		
				return price.getCompanyPrice();
	    	
	    		
	   
	    	}
	    
	
	       
	
	
	

}
