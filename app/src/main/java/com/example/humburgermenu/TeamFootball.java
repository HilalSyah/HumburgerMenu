package com.example.humburgermenu;

public class TeamFootball {

    private String name;
    private int imageResource;
    private String attendanceDescription;

    public TeamFootball(String name, int imageResource, String attendanceDescription) {
        this.name = name;
        this.imageResource = imageResource;
        this.attendanceDescription = attendanceDescription;
    }


    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getAttendanceDescription() {
        return attendanceDescription;
    }


}
