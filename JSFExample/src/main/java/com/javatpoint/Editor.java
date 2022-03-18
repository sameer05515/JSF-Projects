package com.javatpoint;  
import javax.faces.bean.ManagedBean;  
@ManagedBean  
public class Editor {  
private String text;  
public String getText() {  
return text;  
}  
public void setText(String text) {  
this.text = text;  
}  
}  