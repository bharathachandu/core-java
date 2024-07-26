package com.xworkz.flipcart;

import com.xworkz.flipcart.dao.FlipcartDao;
import com.xworkz.flipcart.dto.FlipcartDto;

public class FlipcartRunner {

    public static void main(String[] args) {

        FlipcartDto dto = new FlipcartDto();
        dto.productName = "Samsung Galaxy S23";
        dto.productCategory = "Smartphone";
        dto.productPrice = 74999;
        dto.stockQuantity = 50;
        dto.sellerName = "ElectroStore";

        FlipcartDao dao = new FlipcartDao();
        dao.createProduct(dto);
        dao.getProductDetails();
    }
}
