package _23_design_patterns_behavioral.practice.strategy;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
