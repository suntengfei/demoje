package cn.yd.oa.dao;

import cn.yd.oa.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Product product) {
        String sql = "insert into product(name,price,remark) values (?,?,?)";
        int result = jdbcTemplate.update(sql,new Object[]{product.getName(), product.getPrice(),product.getRemark()});
        return result;
    }

    public int delete(Product product) {
        String sql = "delete from product where id=?";
        int result = jdbcTemplate.update(sql,new Object[]{product.getId()});
        return result;
    }

    public int update(Product product) {
        String sql = "update product set name=?,price=?,remark=? where id=?";
        int result = jdbcTemplate.update(sql,new Object[]{product.getName(),product.getPrice(),product.getRemark(),product.getId()});
        return result;
    }

    public Product getById(Product product){
        String sql = "select * from product where id=?";
        return null;
    }

    public List<Product> queryByName(String name) {
        String sql = "select * from product where name like ?";
        return null;
    }
}
