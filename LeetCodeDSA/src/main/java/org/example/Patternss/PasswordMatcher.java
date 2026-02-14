package org.example.Patternss;

public class PasswordMatcher {
    public static void main(String[] args){
        String password = "Zentrust@11";

        boolean bool = isPasswordStrong(password);
        if(bool) System.out.println("Passwoord is Strong and matches criteria!");

    }

    private static boolean isPasswordStrong(String password) {
        boolean status1 = password.matches("^(?=.*[A-Z]).+$");
        boolean status2 = password.matches("^(?=.*[a-z]).+$");
        boolean status3 = password.matches("^(?=.*[0-9]).+$");
        boolean status4 = password.matches("^(?=.*[^A-Za-z0-9]).+$");
        return status1 && status2 && status3 && status4 && password.length()>=8;
    }

}
