package com.javatpoint;  
import javax.faces.bean.ManagedBean;  
@ManagedBean  
public class ManyCheckBox {  
private String[] selectedCourse;  
public String[] getSelectedCourse() {  
return selectedCourse;  
}  
public void setSelectedCourse(String[] selectedCourse) {  
this.selectedCourse = selectedCourse;  
}  
}  