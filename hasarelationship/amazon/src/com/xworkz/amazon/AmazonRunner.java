package com.xworkz.amazon;

import com.xworkz.amazon.dao.AmazonDao;
import com.xworkz.amazon.dto.AmazonDto;

public class AmazonRunner {

    public static void main(String[] args) {

        AmazonDto dto = new AmazonDto();
        dto.productName = "Apple iPhone 15 Pro";
        dto.productCategory = "Smartphone";
        dto.productPrice = 129999;
        dto.stockQuantity = 100;
        dto.sellerName = "GadgetWorld";
        dto.rating = 4.8; // Example rating
        dto.productDescription = "The latest Apple iPhone 15 Pro with advanced features and performance.";

        AmazonDao dao = new AmazonDao();
        dao.addProduct(dto);
        dao.getProductDetails();
    }
}
