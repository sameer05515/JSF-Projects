package com.javatpoint;  
import javax.faces.application.FacesMessage;  
import javax.faces.bean.ManagedBean;  
import javax.faces.context.FacesContext;  
@ManagedBean  
public class BooleanCheckbox {  
private boolean value;  
public boolean isValue() {  
return value;  
}  
public void setValue(boolean value) {  
this.value = value;  
}  
public void addMessage() {  
String summary = value ? "Checked" : "Unchecked";  
FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));  
}  
}  