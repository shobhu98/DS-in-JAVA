public class BST {
    private Node root;

   public BST(int[] arr){
       root=constructor(arr,0,arr.length-1);

   }
   private Node constructor(int[] arr,int low,int high){
       if(low>high){
           return null ;
       }
       int mid=(low+high)/2;
       Node node=new Node(arr[mid]);
       node.left=constructor(arr,low,mid-1);
       node.right=constructor(arr,mid+1,high);

       return node;

   }
   public void display(){
       display(root);
   }
   private void display(Node node){
       if(node==null){
           return;
       }


      String str="";
       if(node.left==null){
           str+=".";
       }
       else {
           str+=node.left.value;
       }
       str+="=>"+node.value+"<=";
       if(node.right==null){
           str+=".";
       }
       else {
           str+=node.right.value;
       }
       System.out.println(str);
       display(node.left);
       display(node.right);
   }
   public  boolean find(int item){

      return find(root,item);

   }


   private boolean find(Node node, int item){
       if(node==null){
           return false;
       }
       if(item<node.value){
          return find(node.left,item);
       }
       else if(item>node.value){
           return find(node.right,item);
       }
       else if(item==node.value){
           return true;
       }
       return false;

   }
   public int max(){
   return max(root);
   }

    private int max(Node node) {
       if(node.right==null){
           return node.value;
       }
       else{
           return max(node.right);
       }

    }


    private class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value=value;
        }
    }
}

