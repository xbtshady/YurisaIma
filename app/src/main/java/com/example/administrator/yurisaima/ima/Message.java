package com.example.administrator.yurisaima.ima;

import java.util.List;

public class Message {
    private String title;
    private int ImaQuantity;
    private List<Ima> ImaList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImaQuantity() {
        return ImaQuantity;
    }

    public void setImaQuantity(int imaQuantity) {
        ImaQuantity = imaQuantity;
    }

    public List<Ima> getImaList() {
        return ImaList;
    }

    public void setImaList(List<Ima> imaList) {
        ImaList = imaList;
    }
}
