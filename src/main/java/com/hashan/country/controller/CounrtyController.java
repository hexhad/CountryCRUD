package com.hashan.country.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hashan.country.model.Country;
import com.hashan.country.repo.CountryReppo;
import com.hashan.country.service.CountryService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@ApiOperation(value = "", tags = "country profile Controller")
@RestController
public class CounrtyController {
	
	@Autowired
	private CountryService service;
	
	@ApiOperation(value = "Fetch All Countries", response = Country.class)
	@ApiResponses(value = {
			@ApiResponse(code =200, message = "SUCCESS", response = Country.class),
			@ApiResponse(code =401, message = "UNAUTHORIZED"),
			@ApiResponse(code =403, message = "FORBIDDEN"),
			@ApiResponse(code =404, message = "NOT FOUND"),
	})
	@GetMapping("/country")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Country> allcountrys(){
		List<Country> country = new ArrayList<>();
		country = service.allcountry();
		return country;
	}
	
	@ApiOperation(value = "Search country", response = Country.class)
	@GetMapping("/country/{id}")
	public Country searchCat(@PathVariable int id){
		return service.searchcountry(id).get();
	}
	
	@ApiOperation(value = "Add and Update country", response = Country.class)
	@PostMapping("/addcountry")
	public Country saveCats(@RequestBody Country cat){
		return service.savecountrytoDb(cat);
	}
	
	@ApiOperation(value = "Delete specific country", response = Country.class)
	@DeleteMapping("/deletecountry/{id}")
	public String deletecountry(@PathVariable int id){
		return service.deletecountry(id);
	}
	
	
	
}
