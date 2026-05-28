public class get {
    public static void main(String[] args) {
        LinkedList  list = new LinkedList();
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);
        list.print();

        list.getFirst();
        list.getLast();
        list.getAt(2);

    }
}
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
    public void add(int data){
        Node n = new Node(data);
        if(head == null){
            this.head = n;
            this.tail = n;
            this.size =1;
            return;
        }else{
            n.next = this.head;
            this.head = n;
            this.size++;
        }

    }

    public int getFirst(){
        if(head == null){
            return -1;
        }else{
            return head.data;
        }
    }

    public int getLast(){
        if(tail == null){
            return -1;
        }else{
            return tail.data;
        }
    }
    public int getAt(int idx){
        if(idx < 0 || idx >= size){
            return -1;
        }else if(idx == 0){
            return getFirst();
        }else if(idx == size-1){
            return getLast();
        }else{
            Node ptr = this.head;
            while(idx > 0){
                ptr = ptr.next;
                idx--;
            }
            return ptr.data;
        }
    }


    public void print(){
        Node ptr = this.head;
        while(ptr != null){
            System.out.print(ptr.data + " -->");
            ptr = ptr.next;
        }
    }
}
