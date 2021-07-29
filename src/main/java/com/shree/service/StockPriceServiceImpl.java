package com.shree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shree.Entity.StockPrice;
import com.shree.Repository.StockPriceRepository;

@Service
public class StockPriceServiceImpl implements StockPriceService {
	
	@Autowired
	StockPriceRepository repo;

	@Override
	public StockPrice getStockPrice(String companyName) {
		
		StockPrice stockprice = repo.findByCompanyName(companyName);
		     
		return stockprice;
	}

}
