package _23_design_patterns_behavioral.practice.strategy;

import java.util.List;

public class MergeSort implements SortStrategy{
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Merge sort");
    }
}
