package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void  should_return_coordinate_x0_y0_direction_W_given_coordinate_x0_y0_direction_N_command_L(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.N);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("L");
        //then
        Assert.assertEquals(Direction.W,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }
    @Test
    public void  should_return_coordinate_x0_y0_direction_S_given_coordinate_x0_y0_direction_W_command_L(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.W);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("L");
        //then
        Assert.assertEquals(Direction.S,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }
    @Test
    public void  should_return_coordinate_x0_y0_direction_E_given_coordinate_x0_y0_direction_S_command_L(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.S);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("L");
        //then
        Assert.assertEquals(Direction.E,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }
    @Test
    public void  should_return_coordinate_x0_y0_direction_N_given_coordinate_x0_y0_direction_E_command_L(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.E);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("L");
        //then
        Assert.assertEquals(Direction.N,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }
    @Test
    public void  should_return_coordinate_x0_y0_direction_E_given_coordinate_x0_y0_direction_N_command_R(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.N);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("R");
        //then
        Assert.assertEquals(Direction.E,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }
    @Test
    public void  should_return_coordinate_x0_y0_direction_N_given_coordinate_x0_y0_direction_W_command_R(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.W);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("R");
        //then
        Assert.assertEquals(Direction.N,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }
    @Test
    public void  should_return_coordinate_x0_y0_direction_W_given_coordinate_x0_y0_direction_S_command_R(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.S);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("R");
        //then
        Assert.assertEquals(Direction.W,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }
    @Test
    public void  should_return_coordinate_x0_y0_direction_S_given_coordinate_x0_y0_direction_E_command_R(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.E);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("R");
        //then
        Assert.assertEquals(Direction.S,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }


    @Test
    public void  should_return_coordinate_x0_y1_direction_N_given_coordinate_x0_y0_direction_N_command_M(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.N);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("M");
        //then
        Assert.assertEquals(Direction.N,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(1,marsRoverPostion.getCoordinateY());
    }
    @Test
    public void  should_return_coordinate_1x_y0_direction_W_given_coordinate_x0_y0_direction_W_command_M(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.W);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("M");
        //then
        Assert.assertEquals(Direction.W,marsRoverPostion.getDirection());
        Assert.assertEquals(-1,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }
    @Test
    public void  should_return_coordinate_0x_1y_direction_S_given_coordinate_x0_y0_direction_S_command_M(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.S);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("M");
        //then
        Assert.assertEquals(Direction.S,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(-1,marsRoverPostion.getCoordinateY());
    }
    @Test
    public void  should_return_coordinate_1x_0y_direction_E_given_coordinate_x0_y0_direction_E_command_M(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.E);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("M");
        //then
        Assert.assertEquals(Direction.E,marsRoverPostion.getDirection());
        Assert.assertEquals(1,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }
}
