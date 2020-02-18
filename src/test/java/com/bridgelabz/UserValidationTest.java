package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    //Test case for validating first name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.validateFirstName("Wassi");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserValidator.validateFirstName("wassi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenTwoCharacterPresent_ShouldReturnFalse() {
        boolean result = UserValidator.validateFirstName("wa");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenAllUpperCase_ShouldReturnFalse() {
        boolean result = UserValidator.validateFirstName("WASSI");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenDigitsEntered_ShouldReturnFalse() {
        boolean result = UserValidator.validateFirstName("1234");
        Assert.assertFalse(result);
    }

    //Test cases for validating last name
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.validateLastName("Sayed");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserValidator.validateLastName("sayed");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenTwoCharacterPresent_ShouldReturnFalse() {
        boolean result = UserValidator.validateLastName("sa");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_whenAllUpperCase_ShouldReturnFalse() {
        boolean result = UserValidator.validateLastName("SAYED");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_whenDigitsEntered_ShouldReturnFalse() {
        boolean result = UserValidator.validateLastName("1234");
        Assert.assertFalse(result);
    }

    //Test case for validating email address


    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.validateEmailId("abc@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnFalse() {
        boolean result = UserValidator.validateEmailId("abc.@gmail.com");
        Assert.assertFalse(result);
    }

    //Test case for validating phone number
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.validatePhoneNumber("91 9022744550");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenCountryCodeImproper_ShouldReturnFalse() {
        boolean result = UserValidator.validatePhoneNumber("9131 9034554743");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenCountryCodeNotPresent_ShouldReturnFalse() {
        boolean result = UserValidator.validatePhoneNumber("9867011087");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberImproper_ShouldReturnFalse() {
        boolean result = UserValidator.validatePhoneNumber("91 986754815");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenFormatImproper_ShouldReturnFalse() {
        boolean result = UserValidator.validatePhoneNumber("919874502631");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberNotPresent_ShouldReturnFalse() {
        boolean result = UserValidator.validatePhoneNumber("912 ");
        Assert.assertFalse(result);
    }

    //Test case for validating password minimum 8 characters
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.validatePasswordRuleOne("HelloJUnit");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse() {
        boolean result = UserValidator.validatePasswordRuleOne("hello");
        Assert.assertFalse(result);
    }

    //Test case for validating password at-least one Upper case
    @Test
    public void givenPasswordWithAtLeastOneUpperCase_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.validatePasswordRuleTwo("Wassisayed");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneUpperCase_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserValidator.validatePasswordRuleTwo("wassisayed");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneUpperCase_WhenNumberPresent_ShouldReturnFalse() {
        boolean result = UserValidator.validatePasswordRuleTwo("Wassi8080");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneUpperCase_WhenSpecialCharacterPresent_ShouldReturnFalse() {
        boolean result = UserValidator.validatePasswordRuleTwo("Wassi@#%$%$ggd");
        Assert.assertFalse(result);
    }

    //Test case for validating password at-least one digit
    @Test
    public void givenPasswordWithAtLeastOneDigit_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.validatePasswordRuleThree("Wassi8080");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneDigit_WhenDigitNotPresent_ShouldReturnFalse() {
        boolean result = UserValidator.validatePasswordRuleThree("Wassisayed");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneDigit_WhenSpecialCharacterPresent_ShouldReturnFalse() {
        boolean result = UserValidator.validatePasswordRuleThree("Wassi@8080");
        Assert.assertFalse(result);
    }
    //Test case for validating password exactly one special characters
    @Test
    public void givenPassowrdWithExactOneSpecialCharacter_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidator.validatePasswordRuleFour("Wassi@80");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassowrdWithExactOneSpecialCharacter_WhenSpecialCharactersNotPresent_ShouldReturnFalse() {
        boolean result = UserValidator.validatePasswordRuleFour("Wassi123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassowrdWithExactOneSpecialCharacter_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserValidator.validatePasswordRuleFour("wassi@80");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassowrdWithExactOneSpecialCharacter_WhenNumberNotPresent_ShouldReturnFalse() {
        boolean result = UserValidator.validatePasswordRuleFour("Wassi@sayed");
        Assert.assertFalse(result);
    }
}

