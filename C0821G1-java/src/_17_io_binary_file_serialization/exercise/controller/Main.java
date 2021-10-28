package _17_io_binary_file_serialization.exercise.controller;

import _17_io_binary_file_serialization.exercise.service.ProductService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductService myProduct = new ProductService();
        int choice = 0;
        System.out.println("---PRODUCT MANAGEMENT SYSTEM---");
        System.out.println("1.\tAdd new product.");
        System.out.println("2.\tDisplay product.");
        System.out.println("3.\tSearch product.");
        System.out.println("0.\tExit.");
        do {
            System.out.print("Please input option (1.add\t2.show\t3.search\t0.exit): ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    myProduct.addProduct();
                    break;
                case 2:
                    myProduct.showProduct();
                    break;
                case 3:
                    myProduct.searchProduct();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }
}
