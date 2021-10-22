package _11_stack_queue.exercise.stack_reserve;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Đảo ngược phần tử trong mảng số nguyên sử dụng Stack
        Stack<Integer> stack = new Stack<>();
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        for (int i = 0; i < n; i++) {
            stack.push(array[i]);
        }
        System.out.println("First array" + Arrays.toString(array));
        for (int i = 0; i < n; i++) {
            array[i] = stack.pop();
        }
        System.out.println("Last array" + Arrays.toString(array));

        //Đảo ngược chuỗi sử dụng Stack
        Stack<String> wStacks = new Stack<>();
        String mWord = "this is my dog";
        String[] myArray = mWord.toLowerCase().split(" ");
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            wStacks.push(myArray[i]);
            System.out.print("wStacks: " + wStacks);
        }
        System.out.println("\n");
        System.out.println("wStacks after pop 1 word: ");
        for (int i = 0; i < wStacks.size(); i++) {
            wStacks.pop();
            System.out.println(wStacks);
        }
    }
}
