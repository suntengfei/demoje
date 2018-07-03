package cn.yd.oa.servlet;

import cn.yd.oa.dao.ProductDao;
import cn.yd.oa.model.Product;
import cn.yd.oa.service.ProductService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

@WebServlet("/productservlet")
public class ProductServlet extends javax.servlet.http.HttpServlet {
    public ProductService productService = new ProductService();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String remark = request.getParameter("remark");
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setRemark(remark);
        /*List<Product> pl = productService.queryByName("name");
        HttpSession session = request.getSession();
        session.setAttribute("proList",pl);*/
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        List<Product> pl = productService.queryByName(name);
        System.out.println(pl.toString());
        HttpSession session = request.getSession();
        session.setAttribute("proList",pl);
        response.sendRedirect("/select.jsp");
    }
}
