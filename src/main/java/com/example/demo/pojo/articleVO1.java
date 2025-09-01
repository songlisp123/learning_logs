package com.example.demo.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 视图对象
 */
public class articleVO1 {
    private String content;
    private Date timeStamp;
    private int userID;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "articleVO1{" +
                "content='" + content + '\'' +
                ", timeStamp=" + timeStamp +
                ", userID=" + userID +
                '}';
    }
}
