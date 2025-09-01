package com.example.demo.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class User {
    private Integer id;
    private Integer age;
    private Date created;
    private String password;
    private String username;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", created=" + created +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
