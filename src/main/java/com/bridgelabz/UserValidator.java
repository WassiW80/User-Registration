package com.bridgelabz;

public class UserValidator {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    private static final String EMAIL_PATTERN = "^[A-Za-z]{3,}([.|+|_|-]?[A-Za-z0-9]+)?[@][A-Za-z0-9]+[.][A-Za-z]{2,4}([.][A-Za-z]{2,4}+)?$";

    public static boolean validateFirstName(String fname) {
        return fname.matches(NAME_PATTERN);
    }

    public static boolean validateLastName(String lname) {
        return lname.matches(NAME_PATTERN);
    }


    public static boolean validateEmailId(String email) {
        return email.matches(EMAIL_PATTERN);
    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION!!!");
    }
}
