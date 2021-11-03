package _22_design_pattern_structural.exercise.facade;

import java.util.ArrayList;
import java.util.List;

public class RandomList {
    //2. Tạo ra một danh sách số nguyên ngẫu nhiên
    static List<Integer> integerList;

    public void RandomList() {
        this.integerList = new ArrayList<Integer>();
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public static List<Integer> generateList(int size, int min, int max) {
        //khởi tạo List

        RandomNumber randomNumber = new RandomNumber();             //tạo đối thượng ... của lớp RandomNumber
        for (int i = 0; i < size; i++) {
            int randomInteger = randomNumber.generateInteger(min, max);
            integerList.add(randomInteger);
        }
        return integerList;
    }
}
