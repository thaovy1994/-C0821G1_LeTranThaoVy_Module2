package _01_introduction_java.exercise;

import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập giá trị USD :");
        usd = scanner.nextDouble();
        double vnd = rate * usd;
        System.out.println("giá trị VND: " + vnd);
    }
}
