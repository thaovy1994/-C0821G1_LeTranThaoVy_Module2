package _01_introduction_java;

import java.util.Scanner;

public class AskNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number need to read: ");
        int number = scanner.nextInt();

        if (number < 10 && number >= 0) {
            switch (number) {
                case 1:
                    System.out.println("một");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bốn");
                    break;
                case 5:
                    System.out.println("năm");
                    break;
                case 6:
                    System.out.println("sáu");
                    break;
                case 7:
                    System.out.println("bảy");
                    break;
                case 8:
                    System.out.println("tám");
                    break;
                case 9:
                    System.out.println("chín");
                    break;
                default:
                    System.out.println("out of ability");
            }
        }
        if(number>=10 && number <20){
           switch(){

           }
        }
    }
}