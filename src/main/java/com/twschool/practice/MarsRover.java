package com.twschool.practice;

public class MarsRover {
    private final MarsRoverPostion marsRoverPostion;
    public MarsRover(MarsRoverPostion marsRoverPostion) {
        this.marsRoverPostion=marsRoverPostion;
    }
    public void receive(String command) {
        if(command.equals("L")){
            marsRoverPostion.turnLeft();
        }else if(command.equals("R")){
            marsRoverPostion.turnRight();
        }else if(command.equals("M")){
            marsRoverPostion.move();
        }
    }

}
