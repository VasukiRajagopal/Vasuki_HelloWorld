package com.stgit.tdd.dto;

import java.util.List;

/**
 * Class to hold Year Over Year Price Protection details.
 */
public class PriceProtectionRequest {
  private Long proposalKey;
  private String countryCd;
  private String criteria;
  private List<PriceProtectionDetails> priceProtectionDetails;

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

  public String getCriteria() {
    return criteria;
  }

  public void setCriteria(String criteria) {
    this.criteria = criteria;
  }

  public List<PriceProtectionDetails> getPriceProtectionDetails() {
    return priceProtectionDetails;
  }

  public void setPriceProtectionDetails(
      List<PriceProtectionDetails> priceProtectionDetails) {
    this.priceProtectionDetails = priceProtectionDetails;
  }
}
