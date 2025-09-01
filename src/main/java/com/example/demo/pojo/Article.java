package com.example.demo.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Article {
    private Integer id;
    private String content;
    private Date Timestamp;
    private Integer userId;

    public Article() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(Date timestamp) {
        Timestamp = timestamp;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", Timestamp=" + Timestamp +
                ", userId=" + userId +
                '}';
    }
}
