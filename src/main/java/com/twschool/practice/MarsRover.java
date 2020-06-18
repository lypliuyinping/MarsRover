package com.twschool.practice;

public class MarsRover {
    private final MarsRoverPostion marsRoverPostion;
    public MarsRover(MarsRoverPostion marsRoverPostion) {
        this.marsRoverPostion=marsRoverPostion;
    }
    public void receive(String command) {
        if(command.equals("L")){
            if(marsRoverPostion.getDirection().equals("N")){
                marsRoverPostion.setDirection("W");
            }else if(marsRoverPostion.getDirection().equals("W")){
                marsRoverPostion.setDirection("S");
            }else if(marsRoverPostion.getDirection().equals("S")){
                marsRoverPostion.setDirection("E");
            }else if(marsRoverPostion.getDirection().equals("E")){
                marsRoverPostion.setDirection("N");
            }
        }else if(command.equals("R")){
            if(marsRoverPostion.getDirection().equals("N")){
                marsRoverPostion.setDirection("E");
            }else if(marsRoverPostion.getDirection().equals("W")){
                marsRoverPostion.setDirection("N");
            }else if(marsRoverPostion.getDirection().equals("S")){
                marsRoverPostion.setDirection("W");
            }else if(marsRoverPostion.getDirection().equals("E")){
                marsRoverPostion.setDirection("S");
            }
        }
    }

}
