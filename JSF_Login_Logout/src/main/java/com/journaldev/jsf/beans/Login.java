package com.journaldev.jsf.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.test.jsf.practice.Car;
import org.test.jsf.practice.CarsView;

import com.journaldev.jsf.dao.LoginDAO;
import com.journaldev.jsf.util.SessionUtils;

@ManagedBean
@SessionScoped
public class Login implements Serializable {

	private static final long serialVersionUID = 1094801825228386363L;

	private String pwd;
	private String msg;
	private String user;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	// validate login
	public String validateUsernamePassword() {
//		boolean valid = true;//LoginDAO.validate(user, pwd);

		boolean valid = false;// LoginDAO.validate(user, pwd);
		if (user != null && pwd != null && "admin".equals(user) && "admin".equals(pwd)) {
			valid = true;
		}
		if (valid) {
			HttpSession session = SessionUtils.getSession();
			session.setAttribute("username", user);
//			return "admin";

			return "cars";
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
					"Incorrect Username and Passowrd", "Please enter correct username and Password"));
			return "login";
		}
	}

	// logout event, invalidate session
	public String logout() {
		HttpSession session = SessionUtils.getSession();
		session.invalidate();
		return "login";
	}
	
	int counter=0;

	public String addNew() {
//		System.out.println("God! Please print this!!!");
		CarsView carsView=(CarsView) SessionUtils.getSession().getAttribute("carsView");
		counter+=2;
		carsView.getCars().add(new Car(1L+counter, "Maruti"+counter, 1950+counter, "Black"+counter));
		carsView.getCars().add(new Car(2L+counter, "BMW"+counter, 1980+counter, "Black"+counter));
		return "cars";
	}
}
