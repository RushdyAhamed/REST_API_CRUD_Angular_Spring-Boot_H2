package com.app.intern.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.intern.CountryRepository;
import com.app.intern.Entity.Country; 

@Service
@Transactional
public class CountryService {

	@Autowired
	CountryRepository CountryRepository;

	public List<Country> getAllCountry() {
		List<Country> Country = new ArrayList<Country>();
		CountryRepository.findAll().forEach(Country1 -> Country.add(Country1));
		return Country;
	}

	public Country getCountryById(int id) {
		return CountryRepository.findById(id).get();
	}

	public void saveOrUpdate(Country Country) {
		CountryRepository.save(Country);
	}

	public void delete(int id) {
		CountryRepository.deleteById(id);
	}

	public void update(Country Country, int countriid) {
		CountryRepository.save(Country);
	}

}
