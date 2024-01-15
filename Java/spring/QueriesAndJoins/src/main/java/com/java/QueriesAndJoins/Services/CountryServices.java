package com.java.QueriesAndJoins.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.QueriesAndJoins.Repositories.CountryRepository;
@Service
public class CountryServices {
	@Autowired
	private CountryRepository countryRepository;
	

	
	public List<Object[]> sloveneSpeakingCountries() {
		return countryRepository.sloveneSpeakingCountries();
	}
	
	public List<Object[]> citiesPerCountry() {
		return countryRepository.citiesPerCountry();
	}
	
	public List<Object[]> mexicanCityPop() {
		return countryRepository.mexicanCityPop();
	}
	
	public List<Object[]> countryLanguages() {
		return countryRepository.countryLanguages();
	}
	
	public List<Object[]> countrySurfaceArea() {
		return countryRepository.countrySurfaceArea();
	}
	
	public List<Object[]> constitutionalMonarchies() {
		return countryRepository.constitutionalMonarchies();
	}
	
	public List<Object[]> argentinaCities() {
		return countryRepository.argentinaCities();
	}
	
	public List<Object[]> countriesPerRegion() {
		return countryRepository.countriesPerRegion();
	}
}
