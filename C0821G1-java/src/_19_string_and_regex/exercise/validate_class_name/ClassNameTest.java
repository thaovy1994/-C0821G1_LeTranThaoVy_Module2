package _19_string_and_regex.exercise.validate_class_name;

import _19_string_and_regex.practice.validate_email.EmailExample;

public class ClassNameTest {
    private static ClassName className = new ClassName();
    public static final String[] validClassName = {"A1234G", "C0318G"};
    public static final String[] invalidClassName = {"c1234G", "G234H"};

    public static void main(String args[]) {
        for (String a : validClassName) {
            boolean isvalid = className.validate(a);
            System.out.println("Class name is " + a + " is valid: " + isvalid);
        }
        for (String a : invalidClassName) {
            boolean isvalid = className.validate(a);
            System.out.println("Class name is " + a + " is valid: " + isvalid);
        }
    }
}
