package com.javatpoint;  
import javax.faces.bean.ManagedBean;  
@ManagedBean  
public class Keyboard {  
private String value;  
public String getValue() {  
return value;  
}  
public void setValue(String value) {  
this.value = value;  
}  
}  