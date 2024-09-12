package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;

public interface Amazon {
    boolean addProduct(Product product);
    void getProduct();
    void updateProduct(double productPrice);
    void updateProduct(String productName);
    void updateProduct(int productId);

    void deleteProduct();

}
