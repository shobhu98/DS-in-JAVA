public class Queue {
    private Node head;
    private Node tail;
    private int size;

    public void insertLast(int val){
        Node node=new Node(val);
        if(size==0){
            head=node;
            tail=head;
        }
        else {
            tail.next=node;
            tail=node;
        }
        size++;

    }
    public void deleteFirst(){
        System.out.println(head.value);
        head=head.next;
        if(head==null){
            tail=head;
        }
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
