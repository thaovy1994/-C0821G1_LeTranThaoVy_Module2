package _19_string_and_regex.exercise.validate_phone_number;

import _19_string_and_regex.exercise.validate_class_name.ClassName;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber = new PhoneNumber();
    public static final String[] validPhoneNumber = {"84-0978489648"};
    public static final String[] invalidPhoneNumber = {"a8-22222222"};

    public static void main(String args[]) {
        for (String a : validPhoneNumber) {
            boolean isvalid = phoneNumber.validate(a);
            System.out.println("Phone number is " + a + " is valid: " + isvalid);
        }
        for (String a : invalidPhoneNumber) {
            boolean isvalid = phoneNumber.validate(a);
            System.out.println("Phone number is " + a + " is valid: " + isvalid);
        }
    }
}
