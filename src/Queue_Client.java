public class Queue_Client {
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.insertLast(1);
        queue.insertLast(2);
        queue.insertLast(3);
        queue.deleteFirst();
        queue.display();
    }
}
