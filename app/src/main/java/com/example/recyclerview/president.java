package com.example.recyclerview;

public class president {

    private String Name;
    private String Description;
    private int Thumbnail;

    public president(){

    }



    public president(String name, String description, int thumbnail) {
        Name = name;
        Description = description;
        Thumbnail = thumbnail;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }


    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
