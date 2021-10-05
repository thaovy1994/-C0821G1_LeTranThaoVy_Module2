package _03_array_and_method_in_java.exercise.merge_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size1;
        int size2;
        Scanner sc = new Scanner(System.in);

        //Mảng 1:
        do {
            System.out.print("Input size of Array1: ");
            size1 = Integer.parseInt(sc.nextLine());
        } while (size1 < 0);
        int[] array1 = new int[size1];

        for (int i = 0; i < size1; i++) {
            System.out.print("Input index " + i + ": ");
            array1[i] = Integer.parseInt(sc.nextLine());
        }

        //Mảng 2:
        do {
            System.out.print("Input size of Array2: ");
            size2 = Integer.parseInt(sc.nextLine());
        } while (size2 < 0);
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Input index " + i + ": ");
            array2[i] = Integer.parseInt(sc.nextLine());
        }

        //Mảng 3:
        int size3 = array1.length + array2.length;
        System.out.println(size3);
        int[] array3 = new int[size3];

        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[j] = array1[i];
            j++;
        }
        for (int i = 0; i < array2.length; i++) {
            array3[j] = array2[i];
            j++;
        }
        displayArray(array3);
    }

    static void displayArray(int[] array3) {
        System.out.println("Array after was insert: ");
        for (int x : array3)
            System.out.print(x + "\t");
    }
}
