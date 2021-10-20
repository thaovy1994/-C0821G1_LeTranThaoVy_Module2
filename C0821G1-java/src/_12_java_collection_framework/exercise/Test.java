package _12_java_collection_framework.exercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.addProduct(new Product(1, "Milk", 20000.0, 2));
        productManager.addProduct(new Product(2, "Candy", 1000.0, 10));
        productManager.addProduct(new Product(3, "Cake", 10000.0, 5));

        for (Product a : productManager.getListProduct()) {
            System.out.println(a);
        }
        //edit
        Scanner input = new Scanner(System.in);
        System.out.print("Input id's product which need to edit: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.print("Input name's product which need to edit: ");
        String name = input.nextLine();
        System.out.print("Input unit's product which need to edit: ");
        double unit = input.nextDouble();
        System.out.print("Input quantity's product which need to edit: ");
        int quantityOfProduct = Integer.parseInt(input.nextLine());
        productManager.editProduct(id,name,unit,quantityOfProduct);

        //remove
        System.out.print("Enter id to delete product: ");
        int id1 = Integer.parseInt(input.nextLine());
        productManager.removeProduct(id1);

        //Display list Product
        productManager.displaylistProduct();

        //search


        //arrange


    }
}
