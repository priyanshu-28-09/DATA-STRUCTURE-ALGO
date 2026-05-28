class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    Node tail;
    int size;
     
    LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;

    }
    //Add data
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    //Add last
    public void addLast(int data){
        Node n = new Node(data);
        if(head == null){
            this.head =n;
        this.tail = n;
        this.size = 1;
        }else{
            this.tail.next  = n;
            this.tail = n;
            size++;
        }
    }
    //Add in AtIndex;
    public void addAtIndex(int data, int idx){
        if(idx < 0 || idx > size){
            System.out.println("invalid");
        }else if(idx ==0){
            this.add(data);
        }else if(idx == size){
            this.addLast(data);
        }else{
            Node n = new Node(data);
            Node ptr = this.head;
            while(idx > 1){
                ptr = ptr.next;
                idx--;
            }
            Node nbr  = ptr.next;
            ptr.next =n;
            n.next = nbr;
            size++;
        }
    }


    public void print(){
        Node ptr = this.head;

        while(ptr != null){
            System.out.println(ptr.data+" ");
            ptr = ptr.next;
        }
    }
}

public class Add_list {
    public static void main(String[] args) {
        LinkedList  list = new LinkedList();
        list.add(10);
        list.add(20);
        list.addLast(40);
        list.addLast(50);
        list.addAtIndex(30, 2);

        System.out.println("Linked List");
        list.print();

    }
}
