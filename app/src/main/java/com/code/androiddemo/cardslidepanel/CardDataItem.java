package com.code.androiddemo.cardslidepanel;

/**
 * Created by gan on 2016/1/12.
 * 卡片数据装载对象
 */
public class CardDataItem {
    private String imagePath;
    private String userName;
    private int likeNum;
    private int imageNum;

    public int getImageNum() {
        return imageNum;
    }

    public void setImageNum(int imageNum) {
        this.imageNum = imageNum;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
