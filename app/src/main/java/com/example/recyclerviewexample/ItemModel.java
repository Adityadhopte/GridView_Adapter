package com.example.recyclerviewexample;

public class ItemModel {

    int itemImg;
    String itmName,itmDesc ;

    public ItemModel(int itemImg, String itmName, String itmDesc) {
        this.itemImg = itemImg;
        this.itmName = itmName;
        this.itmDesc = itmDesc;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItmName() {
        return itmName;
    }

    public void setItmName(String itmName) {
        this.itmName = itmName;
    }

    public String getItmDesc() {
        return itmDesc;
    }

    public void setItmDesc(String itmDesc) {
        this.itmDesc = itmDesc;
    }
}
