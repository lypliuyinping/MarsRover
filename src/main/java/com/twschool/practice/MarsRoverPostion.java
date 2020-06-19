package com.twschool.practice;

public class MarsRoverPostion {
    private  String direction;
    private  int coordinateY;
    private int coordinateX;

    public MarsRoverPostion(int coordinateX, int coordinateY, String direction) {

        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction =direction;
    }

    public void setCoordinateX(int coordinateX){
        this.coordinateX=coordinateX;
    }
    public void setCoordinateY(int coordinateY){
        this.coordinateY=coordinateY;
    }
    public void setDirection(String direction){
        this.direction=direction;
    }
    public int getcoordinateX()
    {
        return coordinateX;
    }
    public int getCoordinateY(){
        return coordinateY;
    }

    public String getDirection(){
        return direction;
    }

    public void move() {
        if(getDirection().equals("N")){
            setCoordinateY(getCoordinateY()+1);
        }else  if(getDirection().equals("W")){
            setCoordinateX(getcoordinateX()-1);
        }else if(getDirection().equals("S")){
            setCoordinateY(getCoordinateY()-1);
        }else if(getDirection().equals("E")){
            setCoordinateX(getcoordinateX()+1);
        }
    }

    public void turnRight() {
        if(getDirection().equals("N")){
            setDirection("E");
        }else if(getDirection().equals("W")){
            setDirection("N");
        }else if(getDirection().equals("S")){
            setDirection("W");
        }else if(getDirection().equals("E")){
            setDirection("S");
        }
    }

    public void turnLeft() {
        if(getDirection().equals("N")){
            setDirection("W");
        }else if(getDirection().equals("W")){
            setDirection("S");
        }else if(getDirection().equals("S")){
            setDirection("E");
        }else if(getDirection().equals("E")){
            setDirection("N");
        }
    }
}
