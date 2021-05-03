package com.stgit.tdd.s01;

import java.util.Arrays;
import java.util.List;

/**
 * A class to validate Unit Incentive Request - This is for practical session.
 *
 * @author SNITHY11 on 3/10/2021.
 */
public class UnitIncentiveRequestValidator {

  private static final int MIN_CPA_LETTER_REQUIRED = 1;
  private static final List<String> VALID_PAYMENT_TERMS = Arrays
      .asList("OFF-INVOICE", "END PROG YR", "MONTHLY");

  //Following test scenarios must be performed against given UnitIncentiveRequest.
  //1. Given minimum CPA letter should meet above "MIN_CPA_LETTER_REQUIRED"
  //2. Given payment term must be one of above "VALID_PAYMENT_TERMS"
  //3. If isMultiYearDealEnabled in given request, then "startDealYear" and "endDealYear"
  // should be given in the request
  //4. If "startDealYear" is given, then it should match current year
  //5. If "endDealYear" is given, then it should be future year not exceeding (currentYear + 2)


}