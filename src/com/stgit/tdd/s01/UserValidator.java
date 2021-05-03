package com.stgit.tdd.s01;

import com.stgit.tdd.dto.UserDetails;
import java.util.Arrays;
import java.util.List;

/**
 * A class to validate User Details.
 *
 * @author SNITHY11 on 3/10/2021.
 */
public class UserValidator {

  private static final List<String> VALID_COUNTRY_CODES = Arrays.asList("USA", "MEX");

  /**
   * Not a good practice example.
   * 1. Given UserDetails is not finalized.
   * 2. Null check for UserDetails is not available.
   * 3. All validations happening in one place.
   * 4. Redundant countryCd validation - Length check and contains check.
   *
   * @param userDetails - Given user details.
   * @return TRUE if valid user details, Else FALSE.
   */
  public boolean isValidUser_NotGoodExample(UserDetails userDetails) {

    if (userDetails.getUserId() == null) {
      return false;
    } else if (userDetails.getUserId().length() <= 4 && userDetails.getUserId().length() >= 9) {
      return false;
    } else if (userDetails.getFirstName() == null || userDetails.getLastName() == null) {
      return false;
    } else if (userDetails.getFirstName().equalsIgnoreCase(userDetails.getLastName())) {
      return false;
    } else if (userDetails.getAddressLine1() == null || userDetails.getAddressLine2() == null) {
      return false;
    } else if (userDetails.getZipCd() <= 0) {
      return false;
    } else if (userDetails.getCountryCd() == null) {
      return false;
    } else if (userDetails.getCountryCd().length() != 3) {
      return false;
    } else if (!VALID_COUNTRY_CODES.contains(userDetails.getCountryCd())) {
      return false;
    }
    return true;
  }

  /**
   * Good practice example.
   *
   * @param userDetails - Given user details.
   * @return TRUE if valid user details, Else FALSE.
   */
  public boolean isValidUser(final UserDetails userDetails) {

    if (userDetails == null) {
      return false;
    }
    return isValidUserId(userDetails.getUserId())
        && isValidUserName(userDetails.getFirstName(), userDetails.getLastName())
        && isValidAddress(userDetails.getAddressLine1(), userDetails.getAddressLine2(),
        userDetails.getZipCd())
        && isValidCountryCd(userDetails.getCountryCd());
  }

  /**
   * To validate given country code.
   *
   * @param countryCd - Given country code
   * @return TRUE if Valid, False otherwise.
   */
  public boolean isValidCountryCd(String countryCd) {
    boolean isValid = true;
    if (countryCd == null) {
      isValid = false;
    } else if (!VALID_COUNTRY_CODES.contains(countryCd)) {
      isValid = false;
    }
    return isValid;
  }

  /**
   * To validate given address of the user.
   *
   * @param addressLine1 - User's addressLine1
   * @param addressLine2 - User's addressLine2
   * @param zipCd - ZipCode for the user
   * @return TRUE if Valid, False otherwise.
   */
  public boolean isValidAddress(String addressLine1, String addressLine2, int zipCd) {
    boolean isValid = true;
    if (addressLine1 == null || addressLine2 == null) {
      isValid = false;
    } else if (addressLine1.length() == 0 || addressLine2.length() == 0) {
      isValid = false;
    } else if (addressLine1.length() > 100 || addressLine2.length() > 100) {
      isValid = false;
    } else if (zipCd < 10000 || zipCd > 99999) {
      isValid = false;
    }
    return isValid;
  }

  /**
   * To validate given first and last name.
   *
   * @param firstName - Given FirstName of the user
   * @param lastName - Given LastName of the user
   * @return TRUE if Valid, False otherwise.
   */
  public boolean isValidUserName(String firstName, String lastName) {
    boolean isValid = true;
    if (firstName == null || lastName == null) {
      isValid = false;
    } else if (firstName.equalsIgnoreCase(lastName)) {
      isValid = false;
    }
    return isValid;
  }

  /**
   * To validate given userId.
   *
   * @param userId - Given userId
   * @return TRUE if Valid, False otherwise.
   */
  public boolean isValidUserId(String userId) {
    return (userId != null) && (userId.length() >= 4) && (userId.length() <= 9);
  }
  public boolean isValidFirstNameAndLastName(String firstName) {
	  boolean isValid=true;
	  if (firstName==null ){
		  isValid=false;
	  }
			if(firstName.contains("_")) {
				isValid=false;
							}
	  if( firstName.length()<3) {
		  isValid=false;
	  }
	return isValid;

  }
}