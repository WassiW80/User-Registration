package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

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


}
