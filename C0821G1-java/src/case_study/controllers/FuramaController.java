package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        void displayMainMenu(){
        System.out.println("Menu");
        System.out.println("1.\tEmployee Management");
        System.out.println("2.\tCustomer Management");
        System.out.println("3.\tFacility Management");
        System.out.println("4.\tBooking Management");
        System.out.println("5.\tPromotion Management");
        System.out.println("6.\tExit");
        System.out.println("Please choose option");
        int choices = Integer.parseInt(input.nextLine());
        switch (choices){
            case 1:
                System.out.println("1\tDisplay list employees");
                System.out.println("2\tAdd new employee");
                System.out.println("3\tEdit employee");
                System.out.println("4\tReturn main menu");
                break;
            case 2:
                System.out.println("1\tDisplay list customers");
                System.out.println("2\tAdd new customers");
                System.out.println("3\tEdit customers");
                System.out.println("4\tReturn main menu");
            case 3:
                System.out.println("1\tDisplay list facility");
                System.out.println("2\tAdd new facility");
                System.out.println("3\tEdit facility");
                System.out.println("4\tReturn main menu");
            case 4:
                System.out.println("1.\tAdd new booking");
                System.out.println("2.\tDisplay list booking");
                System.out.println("3.\tCreate new contracts");
                System.out.println("4.\tDisplay list contracts");
                System.out.println("3.\tEdit contracts");
                System.out.println("4.\tReturn main menu");
            case 5:
                System.out.println("1.\tDisplay list customers use service");
                System.out.println("2.\tDisplay list customers get voucher");
                System.out.println("3.\tReturn main menu");
            case 6:
                System.exit(6);
        }
//        }
    }
}
