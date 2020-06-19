package com.twschool.practice;

public class MarsRoverPostion {
    private  Direction direction;
    private  int coordinateY;
    private int coordinateX;

    public MarsRoverPostion(int coordinateX, int coordinateY, Direction direction) {
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
    public void setDirection(Direction direction){
        this.direction=direction;
    }
    public int getcoordinateX()
    {
        return coordinateX;
    }
    public int getCoordinateY(){
        return coordinateY;
    }

    public Direction getDirection(){
        return direction;
    }
    //移动
    public void move() {
        if(getDirection().equals(Direction.N)){
            setCoordinateY(getCoordinateY()+1);
        }else  if(getDirection().equals(Direction.W)){
            setCoordinateX(getcoordinateX()-1);
        }else if(getDirection().equals(Direction.S)){
            setCoordinateY(getCoordinateY()-1);
        }else if(getDirection().equals(Direction.E)){
            setCoordinateX(getcoordinateX()+1);
        }
    }
    //右转
    public void turnRight() {
      setDirection(getDirection().rightDirection());
    }
    //左转
    public void turnLeft() {
        setDirection(getDirection().leftDirection());
    }
}
