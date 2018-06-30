package cn.yd.oa.dao;

import cn.yd.oa.model.Product;
import cn.yd.oa.utils.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductDao {
    public int save(Product product){
        String sql = "insert into product(name,price,remark) values (?,?,?)";
        JdbcUtil ju = new JdbcUtil();
        Connection conn = ju.getConnection();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,product.getName());
            ps.setDouble(2,product.getPrice());
            ps.setString(3,product.getRemark());
            int result = ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int delete(Product product){
        String sql = "delete from product where id=?";
        JdbcUtil ju = new JdbcUtil();
        Connection conn = ju.getConnection();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,product.getId());
            int result = ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int update(Product product){
        String sql = "update product set name=?,price=?,remark=? where id=?";
        JdbcUtil ju = new JdbcUtil();
        Connection conn = ju.getConnection();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,product.getName());
            ps.setDouble(2,product.getPrice());
            ps.setString(3,product.getRemark());
            ps.setInt(4,product.getId());
            int result = ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public List<Product> selectAll(){
        String sql = "select * from product";
        JdbcUtil ju = new JdbcUtil();
        Connection conn = ju.getConnection();
        Statement s = null;
        ResultSet rs = null;
        List<Product> list = new ArrayList<Product>();
        try {
            s = conn.prepareStatement(sql);
            rs = ((PreparedStatement) s).executeQuery();
            if(rs !=null){
                ResultSetMetaData metaData = rs.getMetaData();
                int count = metaData.getColumnCount();
                Product product = null;
                while (rs.next()) {
                    product = new Product();
                    for (int i = 1; i <= count; i++) {
                        product.setId(rs.getInt(1));
                        product.setName(rs.getString(2));
                        product.setPrice(rs.getDouble(3));
                        product.setRemark(rs.getString(4));
                        product.setDate(rs.getDate(5));
                    }
                    list.add(product);
                }
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                rs.close();
                s.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
