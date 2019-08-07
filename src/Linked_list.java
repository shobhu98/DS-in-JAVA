public class Linked_list {
    private Node head;
    private Node tail;
    private int size;


    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (size == 0) {
            tail = head;
        }
        size++;

    }

    public void insertLast(int val) {
        if (size == 0) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;


    }

    public void deleteFirst() {
        int val = head.value;
        System.out.println(val);
        head = head.next;
        if (head == null) {
            tail = head;
        }
        size--;
    }

    public void deleteLast() {
        Node node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        node.next = null;
        tail = node;
        size--;

    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + ",");
            node = node.next;

        }
        System.out.print("\b end ");
    }


    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }

    }
}





























































//public class Linked_list {
//    private Node head;
//    private Node tail;
//    private int size;
//
//    public void insertFirst(int value){
//        Node node=new Node(value);
//        node.next=head;
//        head=node;
//        if(size==0){
//            tail=head;
//        }
//        size++;
//
//    }
//    public void insertLast(int value){
//        if(size==0){
//            insertFirst(value);
//            return;
//        }
//        Node node=new Node(value);
//        tail.next=node;
//        tail=node;
//        size++;
//
//    }
//    public void deleteFirst(){
//        Integer value=head.value;
//        System.out.println(value+"deleted");
//        head=head.next;
//
//        if(head==null){
//            tail=head;
//        }
//        size--;
//
//    }
//
//    public void deleteLast(){
//        if(size<2){
//            deleteFirst();
//            return;
//        }
//        Integer value=tail.value;
//        System.out.println(value+"deleted");
//        Node node=head;
//        while (node.next!=null){
//            node=node.next;
//
//        }
//
//        node.next=null;
//        tail=node;
//        size--;
//    }
//    public void display(){
//        Node node=head;
//        while (node!=null){
//            System.out.print(node.value+",");
//            node=node.next;
//
//        }
//        System.out.print("\b end ");
//    }
//
//
//
//
//    private class Node {
//        private Integer value;
//        private  Node next;
//
//        private Node(int value){
//            this.value=value;
//        }
//
//
//    }
//}
