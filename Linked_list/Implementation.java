// package Linked;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size;

    LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public  void addFirst(int val) {
        Node n = new Node(val);

        if (head == null) { // size is 0 and the list is empty
            this.head = n;
            this.tail = n;
            this.size = 1;
            return;
        } else {
            n.next = this.head;
            this.head = n;
            this.size++;
        }
    }

    public  void addLast(int val) {
        Node n = new Node(val);

        if (head == null) { // size is 0 and the list is empty
            this.head = n;
            this.tail = n;
            this.size = 1;
            return;
        } else {
            this.tail.next = n;
            this.tail = n;
            this.size++;
        }
    }

public void print() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}


public int removeFirst(int val){
    if(this.head == null){
        return -1;
    }else{
        int data = this.head.data;
        this.head = this.head.next;
        this.size--;
        return data;
    }
}
public int removeLast(int val){
    if(this.head==null){
        return -1;
    }else{
        Node ptr = this.head;
     while(ptr.next != this.tail){
        ptr = ptr.next;

     }
     int data = this.tail.data;
     ptr.next = null;




        this.size--;

    }
}

public int removeAtIndex(int idx){
    if(this.head == null){
        return -1;
    }else{

    }
}
}

public class Implementation {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(10 + 20); // Prints 30
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(28);
       list.print();
    }
}
//rapper class