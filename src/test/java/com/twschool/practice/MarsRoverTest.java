package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void  should_return_coordinate_0_0_direction_W_when_given_coordinate_0_0_direction_N(){
        //given
        MarsRover marsRover=new MarsRover();
        Coordinate coordinate=new Coordinate(0,0);
        //when
        String result=marsRover.left("N");

        //then
        Assert.assertEquals("W", result);
        Assert.assertEquals(0, coordinate.x);
        Assert.assertEquals(0, coordinate.y);
    }
}
