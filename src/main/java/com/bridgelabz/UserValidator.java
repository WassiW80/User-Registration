package com.bridgelabz;

public class UserValidator {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";

    public static boolean validateFirstName(String name) {
        return name.matches(NAME_PATTERN);
    }
    public static boolean validateLastName(String name) {
        return name.matches(NAME_PATTERN);
    }


    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION!!!");
    }

}
