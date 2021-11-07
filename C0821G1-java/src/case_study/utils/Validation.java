package case_study.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
    static Scanner input = new Scanner(System.in);

                        //class Person
    public static String checkDateOfBirth() {
        String dateOfBirth = input.nextLine();
        while (!Pattern.matches("^([0-9]{2})\\/([0-9]{2})\\/([0-9]{4})$", dateOfBirth)) {
            System.out.print("Wrong format, please enter again: ");
            dateOfBirth = input.nextLine();
        }
        return dateOfBirth;
    }

    public static String checkServiceName() {
        String serviceName = input.nextLine();
        while (!Pattern.matches("^[A-Z]+[a-z]+$", serviceName)) {
            System.out.print("Wrong format, please enter again: ");
            serviceName = input.nextLine();
        }
        return serviceName;
    }


    public static String checkGender() {
        while (true) {
            String gender = input.nextLine();
            if (gender.equalsIgnoreCase("male")
                    || gender.equalsIgnoreCase("female")){
                return gender;
            }else {
                System.out.print("Wrong ! Please enter again: ");
            }
        }
    }

    public static String checkPhoneNumber() {
        String phone = input.nextLine();
        while (!Pattern.matches("^[0]+[0-9]{9}$", phone)) {
            System.out.println("Phone is number with 10 characters");
            phone = input.nextLine();
        }
        return phone;
    }

    public static String checkEmail() {
        String email = input.nextLine();
        while (!Pattern.matches("^[\\w_]+\\@([\\w]+\\.)+[\\w]+[\\w]$", email)) {
            System.out.print("Wrong format, please enter again: ");
            email = input.nextLine();
        }
        return email;
    }

                        //class Facility
    public static Double checkArea() {
        double area;
        do {
            area = Double.parseDouble(input.nextLine());
        } while (area < 30);
        return area;
    }

    public static Double checkRoomRate() {
        double roomrate;
        do {
            roomrate = Double.parseDouble(input.nextLine());
        } while (roomrate < 0);
        return roomrate;
    }

    public static int checkPersonNumber() {
        int personNumber;
        do {
            personNumber = Integer.parseInt(input.nextLine());
        } while (personNumber < 0 || personNumber > 20);
        return personNumber;
    }

    public static byte checkFloorNumber() {
        while (true) {
            byte floorNumber = Byte.parseByte(input.nextLine());
            if (floorNumber > 0) {
                return floorNumber;
            }else{
                System.out.print("Enter again: ");
            }
        }
    }

                        //class Booking
    public static String checkId() {
        String id = input.nextLine();
        while (!Pattern.matches("^[SV]{1}[VL]|[HO]|[RO]+\\-[0-9]{4}$", id)) {
            System.out.print("Wrong format, please enter again: ");
            id = input.nextLine();
        }
        return id;
    }
}
