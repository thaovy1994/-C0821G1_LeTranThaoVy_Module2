package _22_design_pattern_structural.exercise.facade;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> evenList = new ArrayList<>();
        RandomList oddList = new RandomList();
        RandomListFacade.getInstance().printRandomEvenList(5, 1, 10);
        RandomListFacade.getInstance().printRandomEvenList(5, 1, 10, (List<Integer>) oddList, evenList);
    }
}
