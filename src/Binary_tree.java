import java.util.Scanner;

public class Binary_tree {


        private Node root;
        private int size;

        Binary_tree() {
            Scanner s = new Scanner(System.in);
            root = takeInput(s, null, false);

        }

        private Node takeInput(Scanner s, Node parent, boolean isleftright) {
            if (parent == null) {//if the root is null
                System.out.println("enter the value of parent");
            } else {
                if (isleftright) {//for left node we will use true as a boolean and for right we will use false
                    System.out.println("enter the value of left child of" + parent.value);
                } else {
                    System.out.println("enter the value of right child of" + parent.value);
                }

            }

            int nodevalue = s.nextInt();//taking the value frm the user
            Node node = new Node(nodevalue, null, null);
            boolean choice = false;
            System.out.println("do you have left node of " + node.value);
            choice = s.nextBoolean();
            if (choice) {
                node.left = takeInput(s, node, true);//recursively adding addresses in left
            }
            choice = false;
            System.out.println("do you have right node of " + node.value);
            choice = s.nextBoolean();
            if (choice) {
                node.right = takeInput(s, node, false);//recursively adding values in right
            }
            return node;


        }

        public void preOrder() {
            preOrder(this.root);
        }

        private void preOrder(Node node) {
            if (node == null) {
                return;
            }
            System.out.print(node.value + ",");
            preOrder(node.left);
            preOrder(node.right);

        }
        public void postorder(){
            postorder(root);

        }
        private void postorder(Node node){
            if(node==null){
                return;
            }
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.value+",");

        }
        public void inorder(){

        }
        private void inorder(Node node){
            if(node==null){
                return;
            }
            postorder(node.left);
            System.out.print(node.value+",");
            postorder(node.left);
        }


        //declaring a node that consists of value the address of left node and the address of right node
        private class Node {
            private int value;
            private Node left;
            private Node right;

            private Node(int value, Node left, Node right) {
                //providing the relevant values to the objects of node
                this.value = value;//rhs refers to the parameters passed and lhs to the objects of the nodes
                this.left = left;
                this.right = right;

            }

        }


    public void resd(int t,int x){
        System.out.println(t+x);
    }




}

