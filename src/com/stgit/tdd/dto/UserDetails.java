package com.stgit.tdd.dto;

/**
 * Class to hold user details
 */
public class UserDetails {
  private String userId;
  private String firstName;
  private String lastName;
  private String addressLine1;
  private String addressLine2;
  private int zipCd;
  private String countryCd;

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

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public int getZipCd() {
    return zipCd;
  }

  public void setZipCd(int zipCd) {
    this.zipCd = zipCd;
  }

  public String getCountryCd() {
    return countryCd;
  }

  public void setCountryCd(String countryCd) {
    this.countryCd = countryCd;
  }
}
