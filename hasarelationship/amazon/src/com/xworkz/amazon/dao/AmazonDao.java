package com.xworkz.amazon.dao;

import com.xworkz.amazon.dto.AmazonDto;

public class AmazonDao {

    AmazonDto dto;

    public boolean addProduct(AmazonDto dto) {
        boolean isAdded = false;
        System.out.println("Product is added to the inventory");
        if (dto != null) {
            this.dto = dto;
            isAdded = true;
        }
        return isAdded;
    }

    public void getProductDetails() {

            System.out.println("Product Name: " + dto.productName);
            System.out.println("Category: " + dto.productCategory);
            System.out.println("Price: ₹" + dto.productPrice);
            System.out.println("Stock Quantity: " + dto.stockQuantity);
            System.out.println("Seller: " + dto.sellerName);
            System.out.println("Rating: " + dto.rating + " stars");
            System.out.println("Description: " + dto.productDescription);
        }

}
