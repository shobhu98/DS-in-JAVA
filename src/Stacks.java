public class Stacks {
    private Node head;
    private  Node tail;
    private int size;


    public void push(int val){
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
    public void pop(){
        Node node=head;
        while (node.next.next!=null){
            node=node.next;
        }
        node.next=null;
        tail=node;
        size--;
    }
    public void display(){
        Node node=head;
        while (node!=null){
            System.out.print(node.val+",");
            node=node.next;
        }
        System.out.print("\b end ");
    }




    private class Node{
        private int val;
        private Node next;

        private Node(int val){
            this.val=val;

        }


    }
}
