package com.stgit.tdd.dto;

/**
 * Class to hold user details
 */
public class MultiYearBonusRequest {
  private Long proposalKey;
  private String countryCd;
  private int minVolume;
  private int startYear;
  private int endYear;

  public Long getProposalKey() {
    return proposalKey;
  }

  public void setProposalKey(Long proposalKey) {
    this.proposalKey = proposalKey;
  }

  public String getCountryCd() {
    return countryCd;
  }

  public void setCountryCd(String countryCd) {
    this.countryCd = countryCd;
  }

  public int getMinVolume() {
    return minVolume;
  }

  public void setMinVolume(int minVolume) {
    this.minVolume = minVolume;
  }

  public int getStartYear() {
    return startYear;
  }

  public void setStartYear(int startYear) {
    this.startYear = startYear;
  }

  public int getEndYear() {
    return endYear;
  }

  public void setEndYear(int endYear) {
    this.endYear = endYear;
  }
}
