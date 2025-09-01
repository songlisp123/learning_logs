package com.example.demo.pojo;

public class commentVO02 {
    private Integer articleId;
    private String content;
    private Integer userId;

    public commentVO02() {
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "commentVO02{" +
                "articleId=" + articleId +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                '}';
    }
}
