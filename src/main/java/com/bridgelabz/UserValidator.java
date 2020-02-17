package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String FIRSTNAME = "^[A-Z]{1}[a-z]{2,}";

    public static boolean validateFirstName(String fname) {
        if (fname.matches(FIRSTNAME)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION!!!");
    }

}
