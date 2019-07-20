public class Linked_list {
    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(size==0){
            tail=head;
        }
        size++;

    }
    public void display(){
        Node node=head;
        while (node!=null){
            System.out.print(node.value +',');
            node=node.next;

        }
        System.out.print("end \b");
    }



    private class Node {
        private Integer value;
        private  Node next;

        private Node(int value){
            this.value=value;
        }

    }
}