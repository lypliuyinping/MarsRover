package com.twschool.practice;

public class FizzBuzz {
    public String say(int number) {
        if(number % 3 ==0 && number % 5 ==0 && number % 7 ==0){
            return "FizzBuzzWhizz";
        }else if(String.valueOf(number).contains("3")){
            return "Fizz";
        }else if(String.valueOf(number).contains("5")){
            return "BuzzWhizz";
        }else if (number % 3 ==0 && number % 5 ==0){
            return "FizzBuzz";
        } else if(number % 3 ==0 && number % 7 ==0){
            return "FizzWhizz";
        } else if(number % 5 ==0 && number % 7 ==0){
            return "BuzzWhizz";
        } else if(number % 3 ==0 ){
            return "Fizz";
        } else if (number % 5 ==0){
            return "Buzz";
        }else if (number % 7 ==0){
            return "Whizz";
        }
        return "1";
    }
}

