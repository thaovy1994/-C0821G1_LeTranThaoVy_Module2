package _12_java_collection_framework.exercise;

import java.util.ArrayList;
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
    public void editProduct(int id, String name, double unit, int quantityOfProduct) {
        for (int i = 0; i < listProduct.size(); i++) {
            listProduct.get(i).setProductId(id);
//            listProduct.get(i).setProductName(name);
//            listProduct.get(i).setUnitPrice(unit);
//            listProduct.get(i).setQuantity(quantityOfProduct);
        }
    }

    //Xoá sản phẩm theo id
    public void removeProduct(int id) {
        listProduct.remove(id);
    }
}