package com.example.recyclerviewhw.Model;

import android.graphics.drawable.Drawable;

import com.example.recyclerviewhw.R;

import java.io.Serializable;

public class Receipe implements Serializable {
    String id, receipeTitle, receipeOverview, receipeDesc, receipeImage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Receipe(String id, String receipeTitle, String receipeOverview, String receipeDesc, String receipeImage) {
        this.receipeTitle = receipeTitle;
        this.receipeOverview = receipeOverview;
        this.receipeDesc = receipeDesc;
        this.receipeImage = receipeImage;
    }

    public String getReceipeTitle() {
        return receipeTitle;
    }

    public void setReceipeTitle(String receipeTitle) {
        this.receipeTitle = receipeTitle;
    }

    public String getReceipeOverview() {
        return receipeOverview;
    }

    public void setReceipeOverview(String receipeOverview) {
        this.receipeOverview = receipeOverview;
    }

    public String getReceipeDesc() {
        return receipeDesc;
    }

    public void setReceipeDesc(String receipeDesc) {
        this.receipeDesc = receipeDesc;
    }

    public int getReceipeImage() {
        return R.drawable.curry;
    }


    public void setReceipeImage(String receipeImage) {
        this.receipeImage = receipeImage;
    }
}
