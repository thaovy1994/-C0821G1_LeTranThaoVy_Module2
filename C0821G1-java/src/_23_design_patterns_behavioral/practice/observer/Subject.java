package _23_design_patterns_behavioral.practice.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void add(Observer o) {
        observers.add(o);
    }

    public int getState() {
        return state;
    }
    //thiết đặt trạng thái chuyển đổi = goi method execute()
    public void setState(int value) {
        this.state = value;
        execute();
    }

    //thông báo tới các observer thực hiện yêu cầu.
    private void execute() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
