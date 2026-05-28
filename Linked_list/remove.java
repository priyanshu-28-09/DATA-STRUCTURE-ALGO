import java.util.*;

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

    // Fixed: Moved inside LinkedList class
    public void add(int data) {
        Node n = new Node(data);
        if (head == null) {
            this.head = n;
            this.tail = n;
            this.size = 1;
        } else {
            n.next = this.head;
            this.head = n;
            this.size++;
        }
    }

    //remove 1st
    public int removeFirst(){
        if(this.head == null){
            return -1;
        }else{
            int val  =  this.head.data;
            this.head = this.head.next;
            this.size--;
            return val;
        }
    }

    //Remove last
    public int removeLast(){
        if(this.head == null){
            return -1;
        }else{
            Node ptr = this.head;
            while(ptr.next != this.tail){
                ptr = ptr.next;
            }
            int data =this.tail.data;
            ptr.next = null;
            this.tail = ptr;
            this.size--;
            return data;
        }
    }
    //REmove At index
    public int removeAt(int idx){
    if(idx < 0 || idx >= size){
        return -1;
    }else if(idx == 0){
        return removeFirst();
}else if(idx == size-1){
return removeLast();
    }else{
        Node ptr = this.head;
        while(idx  > 1){
            ptr = ptr.next;
            idx--;
        }
        int val = ptr.next.data;
        ptr.next = ptr.next.next;
        this.size--;
        
        return val;
    }
    
}
    // Fixed: Removed parameter and updated print logic
    public void print() {
        Node ptr = this.head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
}

public class remove {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.removeFirst();
        list.removeLast();
        list.removeAt(3);
        list.print();
    }
}
