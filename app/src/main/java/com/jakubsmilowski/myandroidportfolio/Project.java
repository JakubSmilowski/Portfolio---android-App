package com.jakubsmilowski.myandroidportfolio;

import androidx.annotation.NonNull;

public class Project {

    String name;
    String description;
    int image;


    //You can right click and generate it automaticly
    public Project(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
