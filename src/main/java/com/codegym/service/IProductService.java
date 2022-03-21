package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void createProduct(Product Product);

    int findById(int id);

    Product findProductById(int id);

    void update(int id, Product product);

    void delete(Product product);
}