package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
            if (i < products.length - 1) {
                products[i] = products[i + 1];
                products[i + 1] = null;
            } else {
                products[i] = products[products.length - 1];
                products[products.length - 1] = null;
            }
        }
        return products;
    }
}
