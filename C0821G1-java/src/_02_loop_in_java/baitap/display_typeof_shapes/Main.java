package _02_loop_in_java.baitap.display_typeof_shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at bottom-left, bottom-right, top-left, top-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    int h = 3, w = 7;
                    for (int i = 1; i <= h; i++) {
                        for (int j = 1; j <= w; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle (The corner is square at bottom-left)");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle (The corner is square at bottom-right)");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j < 5 - i) {
                                System.out.print("  ");
                            } else {
                                System.out.print(" *");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle (The corner is square at top-left)");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle (The corner is square at top-right)");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 6; k > i; k--) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int row = 0; row <= 5 ; row++) {
                        for (int col = 5; col > row; col--) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= row * 2 - 1; k++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
