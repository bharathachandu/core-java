package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.amazonimp.AmazonImpl;
import com.xworkz.amazonapp.product.Product;

public class AmazonRunner {
    public static void main(String[] args) {

        Product product = new Product();
        product.setProductName("Shoes");
        product.setProductId(1);
        product.setProductPrice(2000.0);

        Amazon amazon = new AmazonImpl();
        amazon.addProduct(product);
        amazon.getProduct();
        amazon.updateProduct(2500.0);
        amazon.updateProduct("sneakers");
        amazon.updateProduct(2);
        System.out.println();
        amazon.getProduct();

        amazon.deleteProduct();
        System.out.println();
        amazon.getProduct();
    }
}
