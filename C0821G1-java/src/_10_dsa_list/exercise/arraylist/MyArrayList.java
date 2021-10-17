package _10_dsa_list.exercise.arraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            //thông báo cho user capacity có vấn đề
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    //return e in MyArrayList
    public int size() {
        return this.size;
    }

    //clean all e in MyArrayList
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    //add e to MyArrayList
    public boolean add(E element) throws IllegalAccessException {  //truyền đối tượng e vào mảng
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;    //gán đội tượng (mình truyền vào) vào vị trí thứ size
        size++;                      //tăng số lượng phần tử lên 1
        return true;
    }

    public void add(E elements, int index) throws IllegalAccessException {
        if (index > this.elements.length) {
            throw new IllegalAccessException("index: " + index);
        } else if (this.elements.length == size) {
            this.ensureCapacity(5);
        }
        if (this.elements[index] == null) {
            this.elements[index] = elements;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                this.elements[i] = this.elements[i - 1];
            }
            this.elements[index] = elements;
            size++;
        }
    }

    //tăng kích thước mảng
    public void ensureCapacity(int minCapacity) throws IllegalAccessException {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalAccessException("minCapacity: " + minCapacity);
        }
    }

    //lấy 1 e tại vị trí i
    public E get(int index) {
        return (E) elements[index];
    }

    //tìm kiếm 1 e
    public int indexOf(E element) {
//        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }

        }
        return -1; //e not exist in MyArrayList
    }

    //kiểm tra 1 e có tồn tại trong mảng ko?
    public boolean contain(E element) {
        return this.indexOf(element) >= 0;
    }

    //tạo bản sao của ArrayList hiện tại
    public MyArrayList<E> clone() {
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }

    //xóa 1 e tại 1 vị trí index
    public E remove(int index) throws IllegalAccessException {
        if (index < 0 || index > elements.length) {
            throw new IllegalAccessException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}

