package _03_array_and_method_in_java.exercise.find_max_in_array2D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row;
        int col;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Input the number of Rows: ");
            row = Integer.parseInt(sc.nextLine());
        } while (row < 0);
        do {
            System.out.print("Input the number of Cols: ");
            col = Integer.parseInt(sc.nextLine());
        } while (col < 0);

        int array2D[][] = new int[row][col];
        System.out.println("Input element to Array2D: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                array2D[i][j] = sc.nextInt();
            }
        }

        int max = array2D[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < array2D[i][j]) {
                    max = array2D[i][j];
                }
            }
        }
        System.out.println("Max in Array2D is: " + max);
    }
}
