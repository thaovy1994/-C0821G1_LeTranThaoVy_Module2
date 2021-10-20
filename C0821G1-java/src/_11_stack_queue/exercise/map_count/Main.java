package _11_stack_queue.exercise.map_count;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //sử dụng 1 TreeMap để lưu trữ một mục bao gồm một từ và số lượng của nó.
        Map<String, Integer> myTreeMap = new TreeMap<>();
        myTreeMap.put("aPPle", 5);

        //Duyệt toàn bộ từ trong chuỗi.
        //chuyển toàn bộ Key thành chữ hoa hoặc chữ thường.
        for (Map.Entry<String, Integer> m : myTreeMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
            System.out.println("\t" + "Upper Case: " + m.getKey().toUpperCase());
            System.out.println("\t" + "Lower Case: " + m.getKey().toLowerCase());
            System.out.println("-----------------------");

            //Kiểm tra xem trong map có key này hay chưa
            String string = "My World";
            System.out.println(string);
            int count = 0;

            Map<Character, Integer> myCounter = new TreeMap<>();

            Scanner input = new Scanner(System.in);
            System.out.print("Input char to check: ");
            char character = input.next().charAt(0);


            for (int i = 0; i < string.length(); i++) {
                if (myCounter.containsKey(character)) {
                    myCounter.put(character, count++);
                } else {
                    myCounter.put(character, 1);
                }
            }
        }
    }
}

