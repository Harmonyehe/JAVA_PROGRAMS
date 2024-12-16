import java.util.*;
class LL {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
}    
}
    public LL(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
}

public class LinkedList{
    public static void main(String[] args){
        LL myLL = new LL(4);
    }
}