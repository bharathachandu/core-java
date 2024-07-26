package com.xworkz.flipcart.dao;

import com.xworkz.flipcart.dto.FlipcartDto;

public class FlipcartDao {
    FlipcartDto dto;
    public boolean createProduct(FlipcartDto dto) {
        boolean isCreated = false;
        System.out.println("Product is added");
        if (dto != null) {
            this.dto = dto;
            isCreated = true;
        }
        return isCreated;
    }
    public void getProductDetails() {

            System.out.println("Product Name: " + dto.productName);
            System.out.println("Category: " + dto.productCategory);
            System.out.println("Price: ₹" + dto.productPrice);
            System.out.println("Stock Quantity: " + dto.stockQuantity);
            System.out.println("Seller: " + dto.sellerName);

        }
}
