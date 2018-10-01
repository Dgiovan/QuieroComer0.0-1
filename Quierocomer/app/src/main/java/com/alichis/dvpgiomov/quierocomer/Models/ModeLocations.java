package com.alichis.dvpgiomov.quierocomer.Models;

/**
 * Created by user on 03/01/2018.
 */

public class ModeLocations {



    private String Titlelocation;
    private int ImageLocation;

    public ModeLocations(String titlelocation, int imageLocation) {
        this.Titlelocation = titlelocation;
        this.ImageLocation = imageLocation;
    }

    public String getTitlelocation() {
        return Titlelocation;
    }

    public void setTitlelocation(String titlelocation) {
        this.Titlelocation = titlelocation;
    }

    public int getImageLocation() {
        return ImageLocation;
    }

    public void setImageLocation(int imageLocation) {
        this.ImageLocation = imageLocation;
    }
}
