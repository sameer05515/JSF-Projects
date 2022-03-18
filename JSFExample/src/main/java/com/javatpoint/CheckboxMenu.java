package com.javatpoint;  
import java.util.ArrayList;  
import java.util.List;  
import javax.annotation.PostConstruct;  
import javax.faces.bean.ManagedBean;  
@ManagedBean  
public class CheckboxMenu {  
private String[] selectedCities;  
private List<String> cities;  
@PostConstruct  
public void init() {  
cities = new ArrayList<>();  
cities.add("Greater Noida");  
cities.add("New Delhi");  
cities.add("Paris");  
cities.add("Tokyo");  
cities.add("Newyork");  
cities.add("Moscow");  
cities.add("Rome");  
cities.add("California");  
cities.add("Shanghai");  
}  
public String[] getSelectedCities() {  
return selectedCities;  
}  
public void setSelectedCities(String[] selectedCities) {  
this.selectedCities = selectedCities;  
}  
public List<String> getCities() {  
return cities;  
}  
}  