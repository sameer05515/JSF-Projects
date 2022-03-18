package com.javatpoint;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class Dropdown implements Serializable {
	private final Map<String, Map<String, String>> data = new HashMap<>();
	private String country;
	private String city;
	private Map<String, String> countries;
	private Map<String, String> cities;

	@PostConstruct
	public void init() {
		countries = new HashMap<>();
		countries.put("USA", "USA");
		countries.put("India", "India");
		countries.put("Russia", "Russia");
		Map<String, String> map = new HashMap<>();
		map.put("New York", "New York");
		map.put("San Francisco", "San Francisco");
		map.put("Denver", "Denver");
		data.put("USA", map);
		map = new HashMap<>();
		map.put("New Delhi", "New Delhi");
		map.put("Bombay", "Bombay");
		map.put("Calcutta", "Calcutta");
		data.put("India", map);
		map = new HashMap<>();
		map.put("Moscow", "Moscow");
		map.put("Saint Petersburg", "Saint Petersburg");
		map.put("Samara", "Samara");
		data.put("Russia", map);
	}

	public Map<String, Map<String, String>> getData() {
		return data;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Map<String, String> getCountries() {
		return countries;
	}

	public Map<String, String> getCities() {
		return cities;
	}

	public void onCountryChange() {
		if (country != null && !country.equals(""))
			cities = data.get(country);
		else
			cities = new HashMap<>();
	}

	public void displayLocation() {
		FacesMessage msg;
		if (city != null && country != null)
			msg = new FacesMessage("Selected", city + " of " + country);
		else
			msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid", "City is not selected.");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}