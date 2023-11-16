import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}

public class InsertInBST {
    public static Node insert(Node root, int x){
        if(root == null){
            root = new Node(x);
        }
        if(root.data > x){
            root.left = insert(root.left,x);
        }
        if(root.data < x){
            root.right = insert(root.right,x);
        }
        return root;
    }

    public static Node insertIterative(Node root, int x){
        Node temp=new Node(x);
        Node parent=null,curr=root;
        while(curr!=null){
            parent=curr;
            if(curr.data>x)
                curr=curr.left;
            else if(curr.data<x)
                curr=curr.right;
            else
                return root;
        }
        if(parent==null)
            return temp;
        if(parent.data>x)
            parent.left=temp;
        else
            parent.right=temp;
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }



    public static void main(String[] args) {
        Node root = null;
        int values[]={10,5,15,12,18};
        for(int i = 0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

//        FindInRange fir = new FindInRange();
//        fir.findInRange(root, 5,12);

        RootToLeafPath rtlp = new RootToLeafPath();
        rtlp.rootToLeafPath(root, new ArrayList<Integer>());
    }
}
