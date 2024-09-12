package com.xworkz.amazonapp.amazonimp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Product;

public class AmazonImpl implements Amazon {

    Product product;

    @Override
    public boolean addProduct(Product product)
    {
        boolean isAdded=true;
        if(product!=null)
        {
            this.product=product;
        }
        return isAdded;
    }

    @Override
    public void getProduct() {
        System.out.println(product);
    }

    @Override
    public void updateProduct(String productName) {
        this.product.setProductName(productName);
    }

    @Override
    public void updateProduct(int productId) {
        this.product.setProductId(productId);
    }

    @Override
    public void updateProduct(double productPrice) {
        this.product.setProductPrice(productPrice);
    }

    @Override
    public void deleteProduct() {
    this.product= null;
    }
}
