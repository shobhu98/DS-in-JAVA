public class BST {
    private Node root;

   public BST(int[] arr){
       root=constructor(arr,0,arr.length);

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



    private class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value=value;
        }
    }
}

