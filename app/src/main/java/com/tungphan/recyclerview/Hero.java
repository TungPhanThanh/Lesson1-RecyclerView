package com.tungphan.recyclerview;

public class Hero {
    private int mImageHero;
    private String mNameHero;

    public Hero(int imageHero, String nameHero) {
        mImageHero = imageHero;
        mNameHero = nameHero;
    }

    public int getImageHero() {
        return mImageHero;
    }

    public void setImageHero(int imageHero) {
        mImageHero = imageHero;
    }

    public String getNameHero() {
        return mNameHero;
    }

    public void setNameHero(String nameHero) {
        mNameHero = nameHero;
    }
}

