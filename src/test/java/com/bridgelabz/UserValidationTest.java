package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    //Test case for validating first name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("Wassi",UserValidator.NAME_PATTERN);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("wassi",UserValidator.NAME_PATTERN);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenTwoCharacterPresent_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("wa",UserValidator.NAME_PATTERN);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenAllUpperCase_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("WASSI",UserValidator.NAME_PATTERN);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenDigitsEntered_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("1234",UserValidator.NAME_PATTERN);
        Assert.assertFalse(result);
    }

    //Test cases for validating last name
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("Sayed",UserValidator.NAME_PATTERN);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("sayed",UserValidator.NAME_PATTERN);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenTwoCharacterPresent_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("sa",UserValidator.NAME_PATTERN);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_whenAllUpperCase_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("SAYED",UserValidator.NAME_PATTERN);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_whenDigitsEntered_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("1234",UserValidator.NAME_PATTERN);
        Assert.assertFalse(result);
    }

    //Test case for validating email address


    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("abc@gmail.com", UserValidator.EMAIL_PATTERN);
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("abc.@gmail.com", UserValidator.EMAIL_PATTERN);
        Assert.assertFalse(result);
    }

    //Test case for validating phone number
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("91 9022744550",UserValidator.PHONE_PATTERN);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenCountryCodeImproper_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("9131 9034554743",UserValidator.PHONE_PATTERN);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenCountryCodeNotPresent_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("9867011087",UserValidator.PHONE_PATTERN);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberImproper_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("91 986754815",UserValidator.PHONE_PATTERN);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenFormatImproper_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("919874502631",UserValidator.PHONE_PATTERN);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberNotPresent_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("912 ",UserValidator.PHONE_PATTERN);
        Assert.assertFalse(result);
    }

    //Test case for validating password minimum 8 characters
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("HelloJUnit",UserValidator.PASSWORD_RULE1);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("hello",UserValidator.PASSWORD_RULE1);
        Assert.assertFalse(result);
    }

    //Test case for validating password at-least one Upper case
    @Test
    public void givenPasswordWithAtLeastOneUpperCase_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("Wassisayed",UserValidator.PASSWORD_RULE2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneUpperCase_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("wassisayed",UserValidator.PASSWORD_RULE2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneUpperCase_WhenNumberPresent_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("Wassi8080",UserValidator.PASSWORD_RULE2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneUpperCase_WhenSpecialCharacterPresent_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("Wassi@#%$%$ggd",UserValidator.PASSWORD_RULE2);
        Assert.assertFalse(result);
    }

    //Test case for validating password at-least one digit
    @Test
    public void givenPasswordWithAtLeastOneDigit_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("Wassi8080",UserValidator.PASSWORD_RULE3);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneDigit_WhenDigitNotPresent_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("Wassisayed",UserValidator.PASSWORD_RULE3);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneDigit_WhenSpecialCharacterPresent_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("Wassi@8080",UserValidator.PASSWORD_RULE3);
        Assert.assertFalse(result);
    }

    //Test case for validating password exactly one special characters
    @Test
    public void givenPassowrdWithExactOneSpecialCharacter_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("Wassi@80",UserValidator.PASSWORD_RULE4);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassowrdWithExactOneSpecialCharacter_WhenSpecialCharactersNotPresent_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("Wassi123",UserValidator.PASSWORD_RULE4);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassowrdWithExactOneSpecialCharacter_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("wassi@80",UserValidator.PASSWORD_RULE4);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassowrdWithExactOneSpecialCharacter_WhenNumberNotPresent_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("Wassi@sayed",UserValidator.PASSWORD_RULE4);
        Assert.assertFalse(result);
    }

}

