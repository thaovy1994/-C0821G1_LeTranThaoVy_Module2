package _05_accessmodifier_static.exercise.xaydung_lop_chighi;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student() {
    }

    //    public void setName(String name) {
//    protected void setName(String name) {
    public void setName(String name) {
//    private void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
