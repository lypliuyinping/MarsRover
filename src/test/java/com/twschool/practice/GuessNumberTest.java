package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberTest {
    @Test
    public void  should_return_4_A_0_B_given_1_2_3_4(){
        //given
        Answer answer =new Answer("1 2 3 4");

        //when
        String result = answer.check("1 2 3 4");
        //then

       Assert.assertEquals("4A0B",result);
    }
}
