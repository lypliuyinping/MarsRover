package com.twschool.practice;

public class FizzBuzz {
    public String say(int number) {
        if(number % 3 ==0 && number % 5 ==0 && number % 7 ==0){
            return "FiZZBuzzWhiZZ";
        }else if (number % 3 ==0 && number % 5 ==0){
            return "FizzBuzz";
        } else if(number % 3 ==0 && number % 7 ==0){
            return "FiZZWhiZZ";
        } else if(number % 5 ==0 && number % 7 ==0){
            return "BuzzWhiZZ";
        } else if(number % 3 ==0){
            return "FiZZ";
        }else if (number % 5 ==0){
            return "BiZZ";
        }else if (number % 7 ==0){
            return "WhiZZ";
        }
        return "1";
    }
}
