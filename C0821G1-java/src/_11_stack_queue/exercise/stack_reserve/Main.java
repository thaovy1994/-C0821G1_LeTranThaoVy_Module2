package _11_stack_queue.exercise.stack_reserve;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Đảo ngược phần tử trong mảng số nguyên sử dụng Stack
        Stack<Integer> stack = new Stack<>();
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println("First array" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("Last array" + Arrays.toString(array));

        //Đảo ngược chuỗi sử dụng Stack
        Stack<String> wStacks = new Stack<>();
        String mWord = "mWord";
        for (int i = 0; i < mWord.length(); i++) {
            wStacks.push(mWord + " ");
            System.out.print("\t" + mWord);
        }
    }
}
