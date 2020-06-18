package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void  should_return_coordinate_x0_y0_direction_W_given_coordinate_x0_y0_direction_N_command_L(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,"N");
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("L");
        //then
        Assert.assertEquals("W",marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }


}
