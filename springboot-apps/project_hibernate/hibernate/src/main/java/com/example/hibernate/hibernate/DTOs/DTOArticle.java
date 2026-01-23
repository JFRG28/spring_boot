package com.example.hibernate.hibernate.DTOs;

public class DTOArticle {

    private Long id;
    private String articleName;
    private Double price;
    private Integer quantity;

    public DTOArticle(Long id, String articleName, Double price, Integer quantity) {
        this.id = id;
        this.articleName = articleName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "DTOArticle{" +
        "id=" + id +
        ", articleName='" + articleName + '\'' +
        ", price=" + price +
        ", quantity=" + quantity +
        '}';
    }

}
