package com.lucaspissuto.dsmeta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaspissuto.dsmeta.entities.Sale;
import com.lucaspissuto.dsmeta.repositories.SaleRepository;

import java.util.List;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
	}
}
