package com.javatpoint;  
import java.util.List;  
import javax.faces.bean.ManagedBean;  
@ManagedBean  
public class ManyButton {  
private List<String> selectedValue;  
public List<String> getSelectedValue() {  
return selectedValue;  
}  
public void setSelectedValue(List<String> selectedValue) {  
this.selectedValue = selectedValue;  
}  
}  