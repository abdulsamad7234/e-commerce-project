package com.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

public class User {
    
    private int id;
    private String name;
    private String email;
    private String country;
    private String password;
    private String role; // Added for user roles (e.g., customer, admin)
    private String address; // Added for user's address
    private List<Order> orderHistory; // To keep track of user's orders

    public User() {
        this.orderHistory = new ArrayList<>(); // Initialize order history
    }

    public User(String name, String email, String country, String password, String role, String address) {
        this.name = name;
        this.email = email;
        this.country = country;
        this.password = password;
        this.role = role;
        this.address = address;
        this.orderHistory = new ArrayList<>(); // Initialize order history
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void addOrder(Order order) {
        this.orderHistory.add(order); // Method to add an order to history
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", country=" + country + ", password="
                + password + ", role=" + role + ", address=" + address + ", orderHistory=" + orderHistory + "]";
    }
}

