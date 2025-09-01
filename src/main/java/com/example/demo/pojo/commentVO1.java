package com.example.demo.pojo;

public class commentVO1 {
    private Integer id;
    private Integer userId;
    private Integer articleId;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public commentVO1() {
    }

    @Override
    public String toString() {
        return "commentVO1{" +
                "id=" + id +
                ", userId=" + userId +
                ", articleId=" + articleId +
                ", content='" + content + '\'' +
                '}';
    }
}
