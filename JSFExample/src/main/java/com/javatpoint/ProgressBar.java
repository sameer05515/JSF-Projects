package com.javatpoint;  
import javax.faces.application.FacesMessage;  
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.ViewScoped;  
import javax.faces.context.FacesContext;  
@ManagedBean  
@ViewScoped  
public class ProgressBar {  
private Integer progress;  
public Integer getProgress() {  
if(progress == null) {  
progress = 0;  
}  
else {  
progress = progress + (int)(Math.random() * 15);  
  
if(progress > 100)  
progress = 100;  
}  
return progress;  
}  
public void setProgress(Integer progress) {  
this.progress = progress;  
}  
public void onComplete() {  
FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Progress Completed"));  
}  
public void cancel() {  
progress = null;  
}  
}