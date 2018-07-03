package cn.yd.oa.model;

import java.util.Date;

public class Product {
    private Integer id;
    private String name;
    private Double price;
    private String remark;
    private Date date;

    public Product() {
        System.out.println("product");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return "id:"+getId().toString()+" name:"+getName()+" price:"+getPrice().toString()+" remark:"+getRemark()+" date:"+getDate().toString();
    }

}
