package com.arq.arqumarket.domain;


public class Product {

    private int ProductId;
    private String name;
    private int modelId;
    private int materialId;
    private String picture;
    private int size;
    private double price;
    private int stock;
    private boolean active;
    private Model model;
    private Material materialD;

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Material getMaterialD() {
        return materialD;
    }

    public void setMaterialD(Material materialD) {
        this.materialD = materialD;
    }
}
