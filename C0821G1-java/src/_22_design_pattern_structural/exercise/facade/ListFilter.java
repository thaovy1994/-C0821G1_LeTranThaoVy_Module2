package _22_design_pattern_structural.exercise.facade;

import java.util.ArrayList;
import java.util.List;

public class ListFilter {
    //3. method Trả về một danh sách các số chẵn
    public static List<Integer> filterOdd(List<Integer> integerList) {
        List<Integer> newList = new ArrayList<>();
        for (Integer number : integerList) {
            if (number % 2 == 0) {
                newList.add(number);
            }
        }
        return newList;
    }
}
