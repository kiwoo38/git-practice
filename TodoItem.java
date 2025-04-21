package org.example.J071;

import java.util.Date;

public class TodoItem {
    private String title;
    private String detail;
    private Date reg_date;

    public TodoItem(String title, String detail) {
        this.title = title;
        this.detail = detail;
        reg_date = new Date();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", reg_date=" + reg_date +
                '}';
    }
}
