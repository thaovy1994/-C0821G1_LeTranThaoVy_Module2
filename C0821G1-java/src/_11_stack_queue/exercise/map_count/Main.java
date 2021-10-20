package _11_stack_queue.exercise.map_count;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //sử dụng 1 TreeMap để lưu trữ một mục bao gồm một từ và số lượng của nó.
        int count = 0;
        Map<String, Integer> myTreeMap = new TreeMap<>();
        myTreeMap.put("apple", 2);
        myTreeMap.put("durian", 4);
        myTreeMap.put("banana", 1);

        //Duyệt toàn bộ từ trong chuỗi.
        //chuyển toàn bộ Key thành chữ hoa hoặc chữ thường.
        for (Map.Entry<String, Integer> m : myTreeMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
            System.out.println("\t" + "Upper Case: " + m.getKey().toUpperCase());
            System.out.println("\t" + "Lower Case: " + m.getKey().toLowerCase());
            System.out.println("-----------------------");
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Input key to check: ");
        String word = input.nextLine();
        //Kiểm tra xem trong map có key này hay chưa

        if (myTreeMap.containsKey(word)) {
            System.out.println("new value: " + myTreeMap.put(word, count++));
        } else {
            System.out.println(myTreeMap.put(word, 1));
        }
    }
}

