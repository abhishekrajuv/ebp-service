package com.payments;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payments.models.Country;
import com.payments.service.CountryService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloWorldRestController {

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<Country> AllUsers() {
		CountryService _service = new CountryService();
		return new ResponseEntity<Country>(_service.GetAllCountries(), HttpStatus.OK);
	}
}
