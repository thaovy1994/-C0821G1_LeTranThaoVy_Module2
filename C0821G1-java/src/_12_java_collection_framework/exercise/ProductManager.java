package _12_java_collection_framework.exercise;

import review._17_11.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    List<Product> listProduct;

    public ProductManager() {
        listProduct = new ArrayList<>();
    }

    public ProductManager(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public void addProduct(Product product) {
        listProduct.add(product);
    }

    //Sửa thông tin sản phẩm theo id
    public void editProduct(Product product) {
        int index = listProduct.indexOf(product);
        if (index == -1) {
            addProduct(product);
        } else {
            listProduct.set(index, product);
        }
    }

    //Xoá sản phẩm theo id
    public void removeProduct(int id) {
        if (id < 0 || id >= listProduct.size()) {
            System.out.println("ID not found" + id);
        }
        this.listProduct.remove(id);
    }

    //hiển thị danh sách sản phẩm
    public void displaylistProduct() {
        for (Product b : listProduct) {
            System.out.println("Product: " + b.toString());
        }
    }

    //tìm kiếm sản phẩm theo tên
    public boolean isExist(Product product) {
        return listProduct.contains(product);
    }

    //Sắp xếp sản phẩm tăng dần, giảm dần theo giá
    public void arrangeInPrice() {
        Collections.sort(listProduct, new Comparator<Product>() {
            public int compare(Product product1, Product product2) {
                double result = product1.getUnitPrice() - product2.getUnitPrice();
                if (result > 0) {
                    return -1;
                } else if (result < 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
}