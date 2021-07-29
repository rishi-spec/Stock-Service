package com.shree.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shree.Entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice,Serializable>{
  
	public StockPrice findByCompanyName(String companyName);
}
