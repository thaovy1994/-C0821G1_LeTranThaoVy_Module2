package _03_array_and_method_in_java.exercise.find_min_in_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Input size: ");
            size = Integer.parseInt(sc.nextLine());
        } while (size < 0);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("input index " + i + ": ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }

        int min = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j;
            }
        }
        System.out.println("\n");
        System.out.println("Min is " + min + " ,at index " + index);
    }
}
