package com.twschool.practice;

import java.util.Arrays;
import java.util.List;

public class Answer {
    private final List<String> answerNumbers;

    public Answer(String answerString) {
        this.answerNumbers= Arrays.asList(answerString.split(" "));
    }

    public String check(String userAnswerString) {
        List<String>  userAnswerNumber=Arrays.asList(userAnswerString.split(" "));
        int allRight=0;
        int partRight=0;
        for(int i=0;i<answerNumbers.size();i++){
            if(answerNumbers.get(i).equals(userAnswerNumber.get(i))){
                allRight++;
            }else if(answerNumbers.contains(userAnswerNumber.get(i))){
                partRight++;
            }
        }
         return allRight + "A" + partRight+"B";
    }
}
