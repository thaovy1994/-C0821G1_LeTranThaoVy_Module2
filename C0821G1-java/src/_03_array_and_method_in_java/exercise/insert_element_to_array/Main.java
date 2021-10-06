package _03_array_and_method_in_java.exercise.insert_element_to_array;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the size N: ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 0);

        int[] array = new int[n];
        for (int i = 0; i < n - 1; i++) {
            System.out.print("Enter index " + i + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("\nArray at fist: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("");
        //Nhập X là số cần chèn
        //Nhập vị trí index cần chèn
        int x;
        int index;
        System.out.print("Enter x to insert into array: ");
        x = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter index to insert x: ");
        index = Integer.parseInt(scanner.nextLine());
        add(array, x, index);
    }

    static void add(int[] array, int x, int index) {
        if (index <= -1 || index >= array.length - 1) {
            System.out.println("can not insert");
        } else {
            for (int i = array.length - 1; i > index; i--) { //duyệt ngược length-1 về index
                array[i] = array[i - 1];
            }
            array[index] = x;
        }
        //nếu ko dùng method display thì dùng lớp tiện ích Arrays.toSring(array) để in mảng mà ko cần duyệt
        //System.out.println(Arrays.toString(array));
        displayArray(array);
    }

    static void displayArray(int[] array) {
        System.out.println("Array after was insert: ");
        for (int x : array)
            System.out.print(x + "\t");
    }
}
