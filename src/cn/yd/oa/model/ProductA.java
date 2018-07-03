package cn.yd.oa.model;

import java.util.Date;

public class ProductA extends Product {
    ProductA(){
        super();
        System.out.println("ProductA");
    }
    public static void main(String[] args) {
        Product a  = new ProductA();
    }
}
