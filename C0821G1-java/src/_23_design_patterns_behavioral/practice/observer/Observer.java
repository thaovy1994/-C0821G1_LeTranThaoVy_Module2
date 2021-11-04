package _23_design_patterns_behavioral.practice.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
