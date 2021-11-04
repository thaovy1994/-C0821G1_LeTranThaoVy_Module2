package case_study.utils;

import java.util.Scanner;

public class Validation {
    static Scanner input = new Scanner(System.in);

    public static boolean checkGender() {
        boolean check;
        String gender = input.nextLine();
        if (gender.equalsIgnoreCase("female")) {
            check = false;
        } else if (gender.equalsIgnoreCase("male")) {
            check = true;
        } else {
            System.out.println("Enter again: ");
            return checkGender();
        }
        return check;
    }

    public static String checkEmployeeLevel() {
        while (true) {
            String level = input.nextLine();
            if (level.equalsIgnoreCase("intermediate")
                    || level.equalsIgnoreCase("associate")
                    || level.equalsIgnoreCase("college")
                    || level.equalsIgnoreCase("postgraduate")) {
                return level;
            } else {
                System.out.print("Wrong ! Please enter again: ");
            }
        }
    }

    public static String checkEmployeeposition() {
        while (true) {
            String position = input.nextLine();
            if (position.equalsIgnoreCase("Receptionist")
                    || position.equalsIgnoreCase("Service staff")
                    || position.equalsIgnoreCase("Senior")
                    || position.equalsIgnoreCase("Supervisor")
                    || position.equalsIgnoreCase("Manager")
                    || position.equalsIgnoreCase("GM")) {
                return position;
            } else {
                System.out.print("Wrong ! Please enter again: ");
            }
        }
    }

    public static String checkCustomerType() {
        while (true) {
            String customerType = input.nextLine();
            if (customerType.equalsIgnoreCase("Member")
                    || customerType.equalsIgnoreCase("Silver")
                    || customerType.equalsIgnoreCase("Gold")
                    || customerType.equalsIgnoreCase("Platinium")
                    || customerType.equalsIgnoreCase("Diamond")) {
                return customerType;
            } else {
                System.out.print("Wrong ! Please enter again: ");
            }
        }
    }
}
