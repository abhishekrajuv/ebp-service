package com.payments.service;

import com.payments.models.Country;

public class CountryService {
	
	public Country GetAllCountries() {
		Country _country = new Country();
		_country.setId(5);
		_country.setCountryCode("NLD");
		_country.setName("Amsterdam");
		_country.setDistrict("Noord+Holland");
		_country.setPopulation(731200);
		
		return _country;
	}
}
