package com.stgit.tdd.dto;

/**
 * A class to hold Year Over Year Price Protection Details.
 */
public class PriceProtectionDetails {

  private int modelYear;
  private double percentage;

  public int getModelYear() {
    return modelYear;
  }

  public void setModelYear(int modelYear) {
    this.modelYear = modelYear;
  }

  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }
}
