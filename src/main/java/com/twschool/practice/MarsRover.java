package com.twschool.practice;

public class MarsRover {
    public String left(String i) {
        if (i=="N")return "W";
        if (i=="W")return "S";
        if (i=="S")return "E";
        if (i=="E")return "N";
        return i;
    }
}
