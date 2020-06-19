package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberTest {
    @Test
    public void  should_return_4A0B_when_compare_with_1234_given_answer_1234(){
        //given
        Answer answer =new Answer("1 2 3 4");

        //when
        String result = answer.check("1 2 3 4");
        //then

       Assert.assertEquals("4A0B",result);
    }
    @Test
    public void  should_return_1A3B_when_compare_with_1423_given_answer_1234(){
        //given
        Answer answer =new Answer("1 2 3 4");

        //when
        String result = answer.check("1 4 2 3");
        //then

        Assert.assertEquals("1A3B",result);
    }

}
