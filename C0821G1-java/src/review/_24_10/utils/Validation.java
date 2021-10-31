package review._24_10.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
    static Scanner input = new Scanner(System.in);

    public static int inputBirthDate() {
        int birthDay;
        do {
            birthDay = Integer.parseInt(input.nextLine());
        } while (birthDay < 1990 | birthDay > 2021);
        System.out.println("Enter again");
        return birthDay;
    }

    public static String inputPhone() {
        String phone = null;
        while (!Pattern.matches("^[0]+[0-9]{9,}$", phone)) {
            System.out.println("Phone is number with minimum 10 characters");
            phone = input.nextLine();
        }
        return phone;
    }

    public static String inputEmail() {
        String email = null;
        while (!Pattern.matches("^[\\w_]+\\@([\\w]+\\.)+[\\w]+[\\w]$", email)) {
            System.out.println("Enter wrong format !");
            email = input.nextLine();
        }
        return email;
    }

    public static int checkExprienceYear() {
        int expInYear;
        do {
            expInYear = input.nextInt();
        } while (expInYear < 0 || expInYear > 100);
        return expInYear;
    }

    public static String checkInputGraduationRank() {
        while (true) {
            String result = null;
            if (!Pattern.matches("Excellence", result)
                    || Pattern.matches("Good", result)
                    || Pattern.matches("Fair", result)
                    || Pattern.matches("Poor", result)) {
                System.out.print("Enter again: ");
                result = input.nextLine();
                return result;
            } else {
                return result;
            }
        }
    }
}
