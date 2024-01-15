package com.java.QueriesAndJoins.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.QueriesAndJoins.Services.CountryServices;

@Controller
public class MainController {
	@Autowired
	private CountryServices countryService;
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Object[]> sloveneSpeakingCountries = countryService.sloveneSpeakingCountries();
		model.addAttribute("sloveneSpeakingCountries", sloveneSpeakingCountries);
		System.out.println(sloveneSpeakingCountries);
		List<Object[]> citiesPerCountry = countryService.citiesPerCountry();
		model.addAttribute("citiesPerCountry", citiesPerCountry);
		
		List<Object[]> mexicanCityPop = countryService.mexicanCityPop();
		model.addAttribute("mexicanCityPop", mexicanCityPop);
		
		List<Object[]> countryLanguages = countryService.countryLanguages();
		model.addAttribute("countryLanguages", countryLanguages);
		
		List<Object[]> countrySurfaceArea = countryService.countrySurfaceArea();
		model.addAttribute("countrySurfaceArea", countrySurfaceArea);
		
		List<Object[]> constitutionalMonarchies = countryService.constitutionalMonarchies();
		model.addAttribute("constitutionalMonarchies", constitutionalMonarchies);
		
		List<Object[]> argentinaCities = countryService.argentinaCities();
		model.addAttribute("argentinaCities", argentinaCities);
		
		List<Object[]> countriesPerRegion = countryService.countriesPerRegion();
		model.addAttribute("countriesPerRegion", countriesPerRegion);
		
		return "index.jsp";
	}
}
