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
        return birthDay;
    }

    public static String inputPhone() {
        String phone = input.nextLine();
        while (!Pattern.matches("^[0]+[0-9]{9,}$", phone)) {
            System.out.println("Phone is number with minimum 10 characters");
            phone = input.nextLine();
        }
        return phone;
    }

    public static String inputEmail() {
        String email = input.nextLine();
        while (!Pattern.matches("^[\\w_]+\\@([\\w]+\\.)+[\\w]+[\\w]$", email)) {
            System.out.println("Wrong format, please enter again: ");
            email = input.nextLine();
        }
        return email;
    }

    public static int checkExprienceYear() {
        int expInYear;
        do {
            expInYear = Integer.parseInt(input.nextLine());
        } while (expInYear < 0 || expInYear > 100);
        return expInYear;
    }

    public static String checkInputGraduationRank() {
        while (true) {
            String result = input.nextLine();
            if (result.equalsIgnoreCase("Excellence")
                    || result.equalsIgnoreCase("Good")
                    || result.equalsIgnoreCase("Fair")
                    || result.equalsIgnoreCase("Poor")) {
                return result;
            } else {
                System.out.print("Enter again: ");
            }
        }
    }
}
