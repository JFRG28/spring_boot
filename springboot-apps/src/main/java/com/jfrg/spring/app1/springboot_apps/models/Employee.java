package com.jfrg.spring.app1.springboot_apps.models;

public class Employee {
    private String name, lastName, address, role;
    private int age, phone, id;    

    public Employee(String name, String lastName, String address, String role, int age, int phone, int id) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.role = role;
        this.age = age;
        this.phone = phone;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
