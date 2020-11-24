package com.hashan.country.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hashan.country.model.Country;

public interface CountryReppo extends JpaRepository<Country, Integer> {

}
