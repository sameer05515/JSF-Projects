package com.javatpoint;  
import javax.faces.bean.ManagedBean;  
@ManagedBean  
public class ColorPicker {  
private String color;  
public String getColor() {  
return color;  
}  
public void setColor(String color) {  
this.color = color;  
}  
}  