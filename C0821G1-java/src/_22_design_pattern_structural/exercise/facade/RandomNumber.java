package _22_design_pattern_structural.exercise.facade;

public class RandomNumber {
    //1. tạo số nguyên ngẫ nhiên
    public static int generateInteger(int min, int max) {
        double randomDouble = Math.random();
        int randomInteger = (int) (randomDouble * (max - min + 1) + min);
        return randomInteger;
    }
}
