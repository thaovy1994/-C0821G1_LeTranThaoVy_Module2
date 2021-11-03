package _22_design_pattern_structural.exercise.facade;

import java.util.List;

public class RandomListFacade {
    private static final RandomListFacade INSTANCE = new RandomListFacade();
    int min;
    int max;
    int size;
    List<Integer> newList;
    List<Integer> integerList;

    private RandomListFacade(int min, int max, int size, List<Integer> newList, List<Integer> integerList) {
        this.min = min;
        this.max = max;
        this.size = size;
        this.newList = newList;
        this.integerList = integerList;
    }

    public RandomListFacade() {

    }

    public static RandomListFacade getInstance() {
        return INSTANCE;
    }

    public void printRandomEvenList(int size, int min, int max) {
        RandomNumber.generateInteger(min, max);
        RandomList.generateList(size, min, max);
        ListFilter.filterOdd(newList);
        ListPrinter.printList(integerList);
    }
    public void printRandomEvenList(int size, int min, int max, List<Integer> newList, List<Integer> integerList) {
        RandomNumber.generateInteger(min, max);
        RandomList.generateList(size, min, max);
        ListFilter.filterOdd(newList);
        ListPrinter.printList(integerList);
    }
}
