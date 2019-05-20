public class BST_client {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        BST bst=new BST(arr);
     //   bst.display();
        System.out.println(bst.find(50));
        System.out.println( bst.find(55));
        System.out.println(bst.max());
        System.out.println(bst.min());
    }
}
