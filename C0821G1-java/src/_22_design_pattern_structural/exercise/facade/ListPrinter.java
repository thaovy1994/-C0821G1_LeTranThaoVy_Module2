package _22_design_pattern_structural.exercise.facade;

import java.util.List;

public class ListPrinter {
    //4. Hiển thị các giá trị của danh sách
    public static void printList(List<Integer> integerList) {
        for (Integer number : integerList) {
            System.out.println(number);
        }
    }
}
