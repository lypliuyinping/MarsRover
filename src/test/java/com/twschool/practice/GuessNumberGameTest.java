package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberGameTest {
    @Test
    public void  should_return_4A0B_when_userStringNumber_1234_given_game_answerString_1234(){
        //given
        GuessNumberAnswer guessNumberAnswer =new GuessNumberAnswer("1 2 3 4");
        GuessNumberGame guessNumberGame =new GuessNumberGame(guessNumberAnswer);
        //when
        String result=guessNumberGame.guess("1 2 3 4");
        //then
        Assert.assertEquals("4A0B",result);
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
    @Test
    public void should_return_failed_when_times_6_userAnswerString_4567_given_game_answerString_1234(){
        //given
        GuessNumberAnswer  guessNumberAnswer =new GuessNumberAnswer("1 2 3 4");
        GuessNumberGame guessNumberGame =new GuessNumberGame(guessNumberAnswer);
        guessNumberGame.guess("4 5 6 7");
        //when
        GameStatus gameStatus=guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GameStatus.FAILED,gameStatus);
    }
}
