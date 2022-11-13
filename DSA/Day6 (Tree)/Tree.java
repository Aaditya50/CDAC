class Tree{

    static class Node{
        int data=0;
        Node left=null;
        Node right=null;

        Node(){}

        Node(int data){
            this.data = data;
        }
        Node (int data,Node left,Node right){
            this.left = left;
            this.right = right;
            this.data = data;
        }
    }

    static int min = Integer.MAX_VALUE;
    public static void min(Node node){
       if(node == null) return ;
       min=Math.min(min,node.data);
       min(node.left);
       min(node.right);

    }


    static int max = Integer.MIN_VALUE;
    public static void max(Node node){
        if(node == null) return;
        max = Math.max(max,node.data);
        max(node.left);
        max(node.right);
    }

    public static boolean find(Node node, int target){
        if(node == null) return false;
        if(node.data>target){
            return find(node.left,target);
        }else if(node.data<target){
            return find(node.right,target);
        }else{
            System.out.println(node.data);
            return true;
        }
    }

    static Node root = null;
    static int index = 0;

    public static void tree(int[] arr){
        root = construct(arr);
    }

    public static Node construct(int[] arr){
        if(arr.length<=index || arr[index]==-1) {
            index++;
            return null;
        }
        Node node = new Node(arr[index++],null,null);
        node.left = construct(arr);
        node.right = construct(arr);
        return node;
    }

    public static int height(Node node){
        if(node == null) return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }

    public static int size(Node node){
        if(node == null) return 0;
        return size(node.left)+size(node.right)+1;
    }

    public static void Preorder(Node node){
        if(node == null) return;
        System.out.print(node.data+" ");
        Preorder(node.left);
        Preorder(node.right);
    }

    public static void InOrder(Node node){
        if(node == null) return;
        
        InOrder(node.left);
        System.out.print(node.data+" ");
        InOrder(node.right);
    }

    public static void PostOrder(Node node){
        if(node == null) return;
        
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data+" ");
    }



    public static void main(String[] args){
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        tree(arr);
        System.out.println("height: " + height(root));
        System.out.println("size: " + size(root));
        min(root);
        System.out.println("Min : " + min);
        max(root);
        System.out.println("Max : " + max);
        System.out.println("PreOrder = ");
        Preorder(root);
        System.out.println("\nInOrder = ");
        InOrder(root);
        System.out.println("\nPostOrder = ");
        PostOrder(root);
    }

}



