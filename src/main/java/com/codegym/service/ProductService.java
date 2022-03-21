package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    static List<Product> products = new ArrayList<>();
    static{
        products.add(new Product(1,"Iphone 13 Pro Max",10000,"Dien thoai","/WEB-INF/views/img/iPhone-13-Pro-Max-2.jpg"));
        products.add(new Product(2,"Iphone 13 Pro",10000,"Dien thoai","/WEB-INF/views/img/iphone-13-pro-sierra-blue-600x600.jpg"));

    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void createProduct(Product Product) {
        products.add(Product);
    }

    @Override
    public int findById(int id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public Product findProductById(int id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
                return products.get(index);
            }
        }
        return null;
    }


    @Override
    public void update(int id, Product product) {
        int index = findById(id);
        products.set(index, product);
    }

    @Override
    public void delete(Product product) {
        products.remove(product);
    }
}