package cn.yd.oa.utils;

import cn.yd.oa.dao.ProductDao;
import cn.yd.oa.model.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JVMDemo {
    private String name;
    private static int num;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println(name);
    }
    public static void main(String[] args){
        ProductDao pd = new ProductDao();
        Product product = new Product();
        product.setName("xiaoming");
        product.setPrice(12.1);
        product.setRemark("B");
        product.setId(1);
        int result = pd.delete(product);
        System.out.println(result);
        //int result = pd.update(product);
        //System.out.println(result);
        //System.out.println(pd.selectAll().toString());
        //System.out.println("ok");
    }
}
