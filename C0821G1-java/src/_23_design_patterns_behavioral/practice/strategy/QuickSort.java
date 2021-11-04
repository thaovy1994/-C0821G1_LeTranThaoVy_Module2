package _23_design_patterns_behavioral.practice.strategy;

import java.util.List;

public class QuickSort implements SortStrategy {
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Quick sort");
    }
}
