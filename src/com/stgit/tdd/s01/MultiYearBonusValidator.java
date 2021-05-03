package com.stgit.tdd.s01;

import com.stgit.tdd.dto.MultiYearBonusRequest;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * A class to validate Multi-Year Bonus submissions.
 *
 * @author SNITHY11 on 3/10/2021.
 */
public class MultiYearBonusValidator {

  private static final List<String> VALID_COUNTRY_CODES = Arrays.asList("USA", "MEX");
  private static final int MIN_REQUIRED_VOLUME = 49;

  /**
   * To validate received multi-year bonus request.
   */
  public boolean validateMultiYearBonusRequest(final MultiYearBonusRequest multiYearBonusRequest) {
    boolean isValid = true;
    if (multiYearBonusRequest == null) {
      isValid = false;
    } else if (!isValidDuration(multiYearBonusRequest.getStartYear(),
        multiYearBonusRequest.getEndYear())) {
      isValid = false;
    } else if (!isValidMinVolume(multiYearBonusRequest.getMinVolume())) {
      isValid = false;
    }
    return isValid;
  }

  /**
   * To validate given volume of total number of vehicles.
   *
   * @param minVolume - Minimum volume of vehicles
   * @return TRUE if it meets minimum expectation, FALSE otherwise.
   */
  public boolean isValidMinVolume(int minVolume) {
    return minVolume >= MIN_REQUIRED_VOLUME;
  }

  /**
   * To validate given range of years between current and future.
   *
   * @param startYear - Multi-Year Bonus start year
   * @param endYear - Multi-Year Bonus end year
   * @return TRUE if duration is applicable, FALSE otherwise.
   */
  public boolean isValidDuration(int startYear, int endYear) {
    boolean isValid = true;
    Calendar current = Calendar.getInstance();

    if (startYear != current.get(Calendar.YEAR)) {
      isValid = false;
    } else if (endYear < current.get(Calendar.YEAR)) {
      isValid = false;
    } else if (endYear > current.get(Calendar.YEAR) + 2) {
      isValid = false;
    }
    return isValid;
  }
}