package _17_io_binary_file_serialization.exercise.service;

import _17_io_binary_file_serialization.exercise.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    public static Product product;
    Scanner input = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();

    List<Product> productRead = readFile("src\\_17_io_binary_file_serialization\\exercise\\product.csv");

    public void write() {
        writeFile("src\\_17_io_binary_file_serialization\\exercise\\product.csv", productList);
    }

    public static void writeFile(String path, List<Product> productList) {
        try {
            FileOutputStream output = new FileOutputStream(path);
            ObjectOutputStream objectOutput = new ObjectOutputStream(output);
//            productList.add(product);     //thêm sản phẩm vào list đã đọc
            objectOutput.writeObject(productList);
            output.close();
            objectOutput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readFile(String path) {
        try {
            FileInputStream input = new FileInputStream(path);
            ObjectInputStream objectInput = new ObjectInputStream(input);
            productList = (List<Product>) objectInput.readObject();
            input.close();
            objectInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Empty");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        return productList;
    }

    public void addProduct() {
        System.out.print("Please enter code: ");
        int code = Integer.parseInt(input.nextLine());
        System.out.print("Please enter product's name: ");
        String name = input.nextLine();
        System.out.print("Please enter product's manufacturer: ");
        String manufacturer = input.nextLine();
        System.out.print("Please enter product's price: ");
        double price = Double.parseDouble(input.nextLine());
        product = new Product(code, name, manufacturer, price);
        productList.add(product);
    }

    public void showProduct() {
        System.out.println("---Product List---");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void searchProduct() {
        System.out.print("Please enter product's code which U need to search: ");
        int productId = Integer.parseInt(input.nextLine());
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productId == productList.get(i).getCode()) {
                check = true;
                System.out.println("Product is found: ");
                System.out.println(productList.get(i).toString());
                break;
            }
        }
        if (!check) {
            System.out.println("Product is not found !");
        }
    }
}
