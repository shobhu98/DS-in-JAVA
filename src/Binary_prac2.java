import java.util.Scanner;

public class Binary_prac2 {
    private Node root;
    private int size;

    Binary_prac2(){
        Scanner s =new Scanner(System.in);
        root=takeInput(s,null,false);
    }

    private Node takeInput(Scanner s,Node parent,boolean isleftorright){
        if(parent==null){
            System.out.println("enter the value of root node");

        }
        else{
            if(isleftorright){
                System.out.println("enter the value of left node"+parent.value);
            }
            else{
                System.out.println("enter the value of right child"+parent.value);
            }
        }
        int nodevalue=s.nextInt();
        Node node=new Node(nodevalue,null,null);
        boolean choice;
        System.out.println("do you have left node of"+node.value);
        choice=s.nextBoolean();
        if(choice){
            node.left=takeInput(s,node,true);
        }

        System.out.println("do you have right node of"+node.value);
        choice=s.nextBoolean();
        if(choice){
            node.left=takeInput(s,node,false);
        }
        return node;


    }



    private class Node{
        private int value;
        private Node left;
        private Node right;

        private Node(int value,Node left,Node right){
            this.left=left;
            this.value=value;
            this.right=right;
        }
    }
}
