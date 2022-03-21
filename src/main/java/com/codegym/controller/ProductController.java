package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    IProductService productService;
    @GetMapping
    private ModelAndView showAllProduct(){
        List<Product> products = this.productService.findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("products",products);
        return modelAndView;
    }
    @GetMapping("/create")
    private ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        return modelAndView;
    }
    @GetMapping("/edit/{id}")
    private ModelAndView showFormEdit(@PathVariable int id){
        Product product = this.productService.findProductById(id);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("product",product);
        return modelAndView;
    }
    @GetMapping("/view/{id}")
    private ModelAndView showProductDetails(@PathVariable int id){
        Product product = this.productService.findProductById(id);
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("product",product);
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    private ModelAndView showFormDelete(@PathVariable int id){
        Product product = this.productService.findProductById(id);
        ModelAndView modelAndView = new ModelAndView("delete");
        modelAndView.addObject("product",product);
        return modelAndView;
    }
    @PostMapping("/create")
    private ModelAndView createNewProduct(int id, String name, double price, String description, String img){
        Product product = new Product(id, name, price, description, img);
        this.productService.createProduct(product);
        ModelAndView modelAndView = new ModelAndView("redirect:/products");
        return modelAndView;
    }
    @PostMapping("/edit/{id}")
    private ModelAndView editProduct(@PathVariable int id, String name, double price, String description, String img){
        Product product = new Product(id,name,price,description,img);
        this.productService.update(id,product);
        ModelAndView modelAndView = new ModelAndView("redirect:/products");
        return modelAndView;
    }
    @PostMapping("/delete/{id}")
    private ModelAndView deleteProduct(@PathVariable int id){
        Product product = this.productService.findProductById(id);
        this.productService.delete(product);
        ModelAndView modelAndView = new ModelAndView("redirect:/products");
        return modelAndView;
    }
}