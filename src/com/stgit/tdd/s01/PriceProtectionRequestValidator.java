package com.stgit.tdd.s01;

import com.stgit.tdd.dto.PriceProtectionDetails;
import com.stgit.tdd.dto.PriceProtectionRequest;
import java.util.Arrays;
import java.util.List;

/**
 * A class to validate Year-Over-Year Price Protection submissions.
 *
 * @author SNITHY11 on 3/10/2021.
 */
public class PriceProtectionRequestValidator {

  private static final String NONE_CRITERIA = "NONE";
  private static final String INTRO_TO_INTRO_CRITERIA = "ITI";
  private static final String FINAL_TO_INTRO_CRITERIA = "FTI";
  private static final List<String> VALID_CRITERIAS = Arrays
      .asList(NONE_CRITERIA, INTRO_TO_INTRO_CRITERIA, FINAL_TO_INTRO_CRITERIA);

  /**
   * To validate received price protection request.
   */
  public boolean validatePriceProtectionRequest(
      final PriceProtectionRequest priceProtectionRequest) {
    boolean isValid = true;
    if (priceProtectionRequest == null) {
      isValid = false;
    } else if (!isValidCriteria(priceProtectionRequest.getCriteria())) {
      isValid = false;
    } else if (!isValidPriceProtectionDetails(priceProtectionRequest.getCriteria(),
        priceProtectionRequest.getPriceProtectionDetails())) {
      isValid = false;
    }
    return isValid;
  }

  /**
   * To validate price protection details against given criteria.
   *
   * @param givenCriteria - Year Over Year Price Protection Criteria.
   * @param priceProtectionDetails - Year Over Year Price Protection Year and percentage values.
   * @return TRUE if valid, FALSE otherwise
   */
  public boolean isValidPriceProtectionDetails(String givenCriteria,
      final List<PriceProtectionDetails> priceProtectionDetails) {
    boolean isValid = true;
    if (givenCriteria.equalsIgnoreCase(NONE_CRITERIA)) {
      isValid = priceProtectionDetails == null || priceProtectionDetails.isEmpty();
    } else if (givenCriteria.equalsIgnoreCase(INTRO_TO_INTRO_CRITERIA) || givenCriteria
        .equalsIgnoreCase(FINAL_TO_INTRO_CRITERIA)) {
      isValid = priceProtectionDetails != null && !priceProtectionDetails.isEmpty();
    }
    return isValid;
  }

  /**
   * To validate given criteria against applicable values.
   *
   * @param givenCriteria - Criteria received from request.
   * @return TRUE if valid criteria, FALSE otherwise.
   */
  public boolean isValidCriteria(String givenCriteria) {
    return givenCriteria != null && VALID_CRITERIAS.contains(givenCriteria);
  }
}