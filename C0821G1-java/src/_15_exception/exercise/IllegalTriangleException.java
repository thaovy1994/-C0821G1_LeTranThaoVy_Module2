package _15_exception.exercise;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    public static void main(String[] not_valid) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter a: ");
            float a = Integer.parseInt(scanner.nextLine());
            System.out.println("Please enter b: ");
            float b = Integer.parseInt(scanner.nextLine());
            System.out.println("Please enter c: ");
            float c = Integer.parseInt(scanner.nextLine());
            if ((a < 0 & b < 0 & c < 0) || (a + b < c || a + c < b || b + c < a)) {
                throw new IllegalTriangleException("not valid");
            } else {
                System.out.println("valid");
            }
//        } catch (IllegalTriangleException e) {
//            System.out.println("not valid");
        }finally {

        }
    }
}
