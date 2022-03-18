package com.javatpoint;  
import javax.faces.application.FacesMessage;  
import javax.faces.bean.ManagedBean;  
import javax.faces.context.FacesContext;  
@ManagedBean  
public class Growl {  
private String username;  
private String password;  
public String getUsername() {  
return username;  
}  
public void setUsername(String username) {  
this.username = username;  
}  
public String getPassword() {  
return password;  
}  
public void setPassword(String password) {  
this.password = password;  
}  
public void displayMessage() {  
FacesContext context = FacesContext.getCurrentInstance();  
context.addMessage(null, new FacesMessage("Login Successfuly", "Welcome: " + username));  
}  
}  