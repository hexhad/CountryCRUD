package com.hashan.country.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashan.country.model.Country;
import com.hashan.country.repo.CountryReppo;

@Service
public class CountryService {
	
	@Autowired
	private CountryReppo repo;
	
	public List<Country> allcountry(){
		return repo.findAll();
	}
	
	public Country savecountrytoDb(Country country) {
		return repo.save(country);
	}
	
	public Optional<Country> searchcountry(int id) {
		return repo.findById(id);
	}
	
	public String deletecountry(int id) {
		String msg;
		try {
			repo.deleteById(id);
			msg = "country Removed";
		} catch (Exception e) {
			msg = "country Error";
		}
		
		return msg;
		
	}
		
}
