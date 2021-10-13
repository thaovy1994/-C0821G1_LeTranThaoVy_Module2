package _08_cleancode_refactoring.practice.split_variable;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        final boolean isFizz = number % 3 == 0;
        final boolean isBuzz = number % 5 == 0;
        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
}
