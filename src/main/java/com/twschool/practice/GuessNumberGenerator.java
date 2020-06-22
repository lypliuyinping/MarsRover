package com.twschool.practice;

import java.util.HashSet;
import java.util.Set;

public class GuessNumberGenerator {
    public String generateNumber(int length) {
        String gameNumber = "";
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; stringSet.size()< length; i++){
            int number = (int) (Math.random()*10);
            stringSet.add(String.valueOf(number));
        }
        for (String number:stringSet){
            gameNumber=gameNumber+number;
        }
        return gameNumber;
    }

}
