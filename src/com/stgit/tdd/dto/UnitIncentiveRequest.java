package com.stgit.tdd.dto;

/**
 * A class to hold unit incentive information.
 */
public class UnitIncentiveRequest {

  private int minCpaLetter;
  private String paymentTerm;
  private boolean isMultiYearDealEnabled;
  private int startDealYear;
  private int endDealYear;

  public int getMinCpaLetter() {
    return minCpaLetter;
  }

  public void setMinCpaLetter(int minCpaLetter) {
    this.minCpaLetter = minCpaLetter;
  }

  public String getPaymentTerm() {
    return paymentTerm;
  }

  public void setPaymentTerm(String paymentTerm) {
    this.paymentTerm = paymentTerm;
  }

  public boolean isMultiYearDealEnabled() {
    return isMultiYearDealEnabled;
  }

  public void setMultiYearDealEnabled(boolean multiYearDealEnabled) {
    isMultiYearDealEnabled = multiYearDealEnabled;
  }

  public int getStartDealYear() {
    return startDealYear;
  }

  public void setStartDealYear(int startDealYear) {
    this.startDealYear = startDealYear;
  }

  public int getEndDealYear() {
    return endDealYear;
  }

  public void setEndDealYear(int endDealYear) {
    this.endDealYear = endDealYear;
  }
}
