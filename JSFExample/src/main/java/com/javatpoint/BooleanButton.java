package com.javatpoint;  
import javax.faces.bean.ManagedBean;  
@ManagedBean  
public class BooleanButton {  
private boolean checkValue;     
public boolean isCheckValue() {  
return checkValue;  
}  
public void setCheckValue(boolean checkValue) {  
this.checkValue = checkValue;  
}  
}  