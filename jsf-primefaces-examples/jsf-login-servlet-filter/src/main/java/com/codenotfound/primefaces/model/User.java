package com.codenotfound.primefaces.model;

import java.io.Serializable;

public class User implements Serializable {

  private static final long serialVersionUID = -1389546558353914770L;

  private String userId;
  private String firstName;
  private String lastName;

  public User(String userId, String firstName, String lastName) {
    this.userId = userId;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getName() {
    return firstName + " " + lastName;
  }
}
