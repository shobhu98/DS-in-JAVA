import java.util.Scanner;

public class Binary_prac2 {
    private Node root;
    private int size;

    Binary_prac2(){
        Scanner s=new Scanner(System.in);
        root=takeInput(s,null,false);
    }
    private Node takeInput(Scanner s,Node parent,boolean isleftorright){
        if(parent==null){
            System.out.println("enter the value of the root node ");
        }
        else {
            if(isleftorright){
                System.out.println("enter the value of left child of"+parent.val);
            }
            else {
                System.out.println("enter the value of left child of"+parent.val);

            }
        }
        int nodeValue=s.nextInt();
        Node node=new Node(nodeValue,null,null);
        boolean choice=false;
        System.out.println("Do you have  left child of"+node.val);
        choice=s.nextBoolean();
        if(choice){
            node.left=takeInput(s,node,true);

        }
         choice=false;
        System.out.println("Do you have  right child of"+node.val);
        choice=s.nextBoolean();
        if(choice){
            node.right=takeInput(s,node,false);
        }

        return node;


    }










private class Node{
    private  int val;
    private Node left;
    private Node right;

    private Node(int val,Node left,Node right){
        this.val=val;
        this.right=right;
        this.left=left;

    }
}
}