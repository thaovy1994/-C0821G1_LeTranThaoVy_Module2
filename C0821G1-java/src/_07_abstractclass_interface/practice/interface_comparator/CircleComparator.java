package _07_abstractclass_interface.practice.interface_comparator;

import _07_abstractclass_interface.practice.interface_comparable.Circle;

public class CircleComparator implements Comparator {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
