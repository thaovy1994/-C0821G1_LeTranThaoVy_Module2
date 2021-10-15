package _10_dsa_list.exercise.linkedlist;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    private Node head;
    private int numNode = 0;   //mô tả số lượng Node trong list

    //khai báo constructor cho MyLinkedlist

    public MyLinkedList() {
    }

    //add 1 e vào đầu list
    public  void addFirst(E element){
        //khai báo 1 biến temp tham chiếu đến giá trị của head
        Node temp = head;
        //biến head nhận giá trị là 1 node mới
        head = new Node(element);    //node mới có data là e mình truyền vào
        //chèn e vào e đầu tiên: head.next trỏ đến temp
        head.next = temp;
        numNode++;
    }
    public void addLast(E element){
        Node temp = head;
        while (temp.next !=null){
            temp=temp.next;
        }
        temp.next = new Node(element);
        numNode++;
    }
public void add(int index, E element){
        Node temp = head;
        Node holder;
}
}
