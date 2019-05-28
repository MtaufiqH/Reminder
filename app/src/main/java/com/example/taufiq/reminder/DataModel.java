package com.example.taufiq.reminder;

/**
 * Created By Taufiq on 5/27/2019.
 * Reminder
 */
public class DataModel {

    private String nama;
    private String time;
    private String like;
    private String comment;

    public DataModel(String nama, String time, String like, String comment) {
        this.nama = nama;
        this.time = time;
        this.like = like;
        this.comment = comment;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
