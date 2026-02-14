package org.example.Patternss;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

    public static void main(String[] args) {

        // 1️⃣ Extract digits
        String input = "hello&*$%^((123";
        Pattern digitPattern = Pattern.compile("\\d+");
        Matcher digitMatcher = digitPattern.matcher(input);

        if (digitMatcher.find()) {
            System.out.println(digitMatcher.group()); // 123
        }

        // 2️⃣ Extract special characters
        String specialChars = input.replaceAll("[a-zA-Z0-9]", "");
        System.out.println(specialChars);

        // 3️⃣ Email validation
        String mailId = "chethan.kumarn@onetrust.com";
        boolean emailStatus = mailId.matches("[a-zA-Z.]+@[a-zA-Z]+\\.com");
        System.out.println(emailStatus);

        // 4️⃣ Extract numeric part from alphanumeric
        String alphaNumeric = "chethan9945621362";
        Matcher numMatcher = digitPattern.matcher(alphaNumeric);

        if (numMatcher.find()) {
            System.out.println(numMatcher.group());
        }

        // 5️⃣ Name validation
        String name = "Chethan";
        System.out.println(patternToMatchString(name));

        // 6️⃣ Phone number validation
        String indianNumber = "+91-9945621362";
        String usNumber = "+1 8234789920";

        System.out.println(patternToValidatePhoneNumberOFDifferentCountries(indianNumber, "India"));
        System.out.println(patternToValidatePhoneNumberOFDifferentCountries(usNumber, "USA"));
    }

    // ✔ Alphabet-only name validation
    private static boolean patternToMatchString(String name) {
        return name.matches("[A-Za-z]+");
    }

    // ✔ Country-based phone validation
    private static boolean patternToValidatePhoneNumberOFDifferentCountries(String mobileNumber,String countryName) {
        switch (countryName) {
            case "India":
                return mobileNumber.matches("^\\+91-[6-9]\\d{9}$");

            case "USA":
                return mobileNumber.matches("^\\+1[ ]\\d{10}");
            default:
                return false;
        }
    }
}
