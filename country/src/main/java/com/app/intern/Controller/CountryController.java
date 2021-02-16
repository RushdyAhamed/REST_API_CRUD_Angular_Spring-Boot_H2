package com.app.intern.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.	web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.intern.Entity.Country;
import com.app.intern.Service.CountryService; 

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/rest/v2") // base declaration
public class CountryController {

	@Autowired
	CountryService CountryService;

	@GetMapping("/country") // GET method to return all Countries
	private List<Country> getAllCountry() {
		return CountryService.getAllCountry();
	}

	@GetMapping("/country/{countryid}") // To return specific Country
	private Country getCountry(@PathVariable("countryid") int countryid) {
		return CountryService.getCountryById(countryid);
	}

	@DeleteMapping("/country/{countryid}") // DELETE method to delete a Country
	private void deleteCountri(@PathVariable("countryid") int countryid) {
		CountryService.delete(countryid);
	}

	@PostMapping("/country") // POST method to add new Country
	private int saveCountry(@RequestBody Country Country) {
		CountryService.saveOrUpdate(Country);
		return Country.getId();
	}

	@PutMapping("/country") // PUT method to update a Country
	private Country update(@RequestBody Country Country) {
		CountryService.saveOrUpdate(Country);
		return Country;
	}

}
