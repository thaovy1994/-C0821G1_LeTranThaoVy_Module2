package _11_stack_queue.exercise.map_count;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Đếm từ trong chuỗi:
        String str = "Ha noi ha";
        String[] myArr = str.toLowerCase().split(" ");
        System.out.println(Arrays.toString(myArr));
        Map<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < myArr.length; i++) {
            String key = myArr[i];
            if (myMap.containsKey(key)) {
                int currentValue = myMap.get(key);
                myMap.put(key, currentValue + 1);
            } else {
                myMap.put(key, 1);
            }
        }
        System.out.println(myMap);

        //Đếm ký tự trong chuỗi:
//        String str = "Ha noi ha";
//        Map<String, Integer> myMap = new HashMap<>();
//        String character;
//        for (int i = 0; i < str.length(); i++) {
//            //valueOf method dùng để chuyển đổi kiểu int, long... về String
//            character = String.valueOf(str.charAt(i)).toLowerCase();
//            if(myMap.containsKey(character)){
//
//                int currentValue = myMap.get(character); //lấy value
//
//                //cập nhật value 1 key trong map:
//                //myMap.replace(character, currentValue + 1);
//                myMap.put(character, currentValue + 1);
//
//            } else {
//                myMap.put(character, 1);
//            }
//        }
//        System.out.println(myMap);
    }
}

