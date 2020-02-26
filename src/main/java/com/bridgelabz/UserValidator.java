package com.bridgelabz;

public class UserValidator {
    public static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    public static final String EMAIL_PATTERN = "^[A-Za-z]{3,}([.|+|_|-]?[A-Za-z0-9]+)?[@][A-Za-z0-9]+[.][A-Za-z]{2,4}([.][A-Za-z]{2,4}+)?$";
    public static final String PHONE_PATTERN = "^[1-9]{1}[0-9]{1,2}[ ][1-9]{1}[0-9]{9}$";
    public static final String PASSWORD_RULE1 = "^[A-Za-z]{8,}$";
    public static final String PASSWORD_RULE2 = "^(?=.*[A-Z])[A-Za-z]{8,}$";
    public static final String PASSWORD_RULE3 = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,}$";
    public static final String PASSWORD_RULE4 = "^(?=.?[A-Z])(?=[^@|#|$|%|&]*[@|#|$|%|&][^@|#|$|%|&]*$)(?=.*[0-9])[A-Za-z0-9@#$%&]{8,}$";



    public static boolean userDataValidation(String data,String pattern){
        return data.matches(pattern);
    }
}
