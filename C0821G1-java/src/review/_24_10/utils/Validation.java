package review._24_10.utils;

import java.util.Scanner;

public class Validation {
    static Scanner input = new Scanner(System.in);

    public static String inputEmail() {
        String checkEmail = "";
        boolean check = true;
        while (check) {
            System.out.println("Enter email: ");
            checkEmail = input.nextLine();
            if (!checkEmail.matches("[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$")) {
                System.out.println("No matches");
            } else {
                check = false;
            }
        }
        return checkEmail;
    }

    public static int inputBirthDate() {
        int birthDay;
        do {
            birthDay = Integer.parseInt(input.nextLine());
        } while (birthDay < 1990 | birthDay > 2021);
        System.out.println("Enter again");
        return birthDay;
    }

    public static int inputPhone() {
        int phone;
        do {
            System.out.println("Phone is number with minimum 10 characters");
            phone = Integer.parseInt(input.nextLine());
        } while (phone >= 10);
        System.out.println("Enter again");
        return phone;
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
