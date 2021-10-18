package _10_dsa_list.exercise.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student(){
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"Anh");
        Student student2 = new Student(3,"Chi");
        Student student3 = new Student(4,"Duy");
        Student student4 = new Student(2,"Lan");

        myLinkedList.addFirst(student1);
    }
}
