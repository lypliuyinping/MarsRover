package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberTest {
    @Test
    public void  should_return_4A0B_when_compare_with_1234_given_answer_1234(){
        //given
        GuessNumberAnswer guessNumberAnswer =new GuessNumberAnswer("1 2 3 4");

        //when
        String result = guessNumberAnswer.check("1 2 3 4");
        //then

       Assert.assertEquals("4A0B",result);
    }
    @Test
    public void  should_return_1A3B_when_compare_with_1423_given_answer_1234(){
        //given
        GuessNumberAnswer guessNumberAnswer =new GuessNumberAnswer("1 2 3 4");

        //when
        String result = guessNumberAnswer.check("1 4 2 3");
        //then

        Assert.assertEquals("1A3B",result);
    }

    @Test
    public void  should_return_1A1B_when_compare_with_1456_given_answer_1234(){
        //given
        GuessNumberAnswer guessNumberAnswer =new GuessNumberAnswer("1 2 3 4");

        //when
        String result = guessNumberAnswer.check("1 4 5 6");
        //then

        Assert.assertEquals("1A1B",result);
    }

    @Test
    public void  should_return_0A4B_when_compare_with_4312_given_answer_1234(){
        //given
        GuessNumberAnswer guessNumberAnswer =new GuessNumberAnswer("1 2 3 4");

        //when
        String result = guessNumberAnswer.check("4 3 1 2");
        //then

        Assert.assertEquals("0A4B",result);
    }
    @Test
    public void  should_return_0A3B_when_compare_with_4315_given_answer_1234(){
        //given
        GuessNumberAnswer guessNumberAnswer =new GuessNumberAnswer("1 2 3 4");

        //when
        String result = guessNumberAnswer.check("4 3 1 5");
        //then

        Assert.assertEquals("0A3B",result);
    }
    @Test
    public void  should_return_0A0B_when_compare_with_5678_given_answer_1234(){
        //given
        GuessNumberAnswer guessNumberAnswer =new GuessNumberAnswer("1 2 3 4");

        //when
        String result = guessNumberAnswer.check("5 6 7 8");
        //then

        Assert.assertEquals("0A0B",result);
    }
    @Test
    public void should_return_success_when_userAnswerString_1234_given_game_answerString_1234(){
        //given
        GuessNumberAnswer  guessNumberAnswer =new GuessNumberAnswer("1 2 3 4");
        GuessNumberGame guessNumberGame =new GuessNumberGame(guessNumberAnswer);
        guessNumberGame.guess("1 2 3 4");
        //when
        GameStatus  gameStatus=guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GameStatus.SUCCESS,gameStatus);
    }

}
