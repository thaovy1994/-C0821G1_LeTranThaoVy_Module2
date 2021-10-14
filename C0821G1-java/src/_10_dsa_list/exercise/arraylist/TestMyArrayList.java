package _10_dsa_list.exercise.arraylist;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {

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

    public static void main(String[] args) throws IllegalAccessException {
        Student a = new Student(1, "Anh");
        Student b = new Student(2, "Duy");
        Student c = new Student(3, "Huy");
        Student d = new Student(4, "Lan");
        Student e = new Student(5, "Khanh");
        Student f = new Student(6, "Nga");

        //Khai báo MyArrayList kdl Student, add vào
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        //Khai báo 1 ArrayList mới cho method clone
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
//        studentMyArrayList.add(f, 2);

//        for (int i = 0; i < studentMyArrayList.size(); i++) {
//            Student students = (Student) studentMyArrayList.elements[i];
//            System.out.print(students.getId() + "\t");
//            System.out.println(students.getName());
        studentMyArrayList.size();
        System.out.println("size: " + studentMyArrayList.size());

//        System.out.println(studentMyArrayList.get(2).getName());
//        System.out.println(studentMyArrayList.indexOf(f));
//        System.out.println(studentMyArrayList.contain(b));
        newMyArrayList = studentMyArrayList.clone();
        newMyArrayList.remove(0);
        for (int i = 0; i <= newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }
    }
}

