package com.twschool.practice;

public class FizzBuzz {
    public String say(int number) {
        if(number % 3 ==0){
            return "FiZZ";
        }else if (number % 5 ==0){
            return "BiZZ";
        }
        return "1";
    }
}
