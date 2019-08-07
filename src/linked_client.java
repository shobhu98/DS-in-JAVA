public class linked_client {
    public static void main(String[] args) {
        Linked_list list=new Linked_list();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
//        list.deleteFirst();
        list.deleteLast();
        list.display();
    }
}
