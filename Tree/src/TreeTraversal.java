public class TreeTraversal {
    // Building a Tree from its Preorder traversal
    static int indx = -1;
    public static Node buildTree(int nodes[]){
        indx++;
        if(nodes[indx]==-1){
            return null;
        }
        Node root = new Node(nodes[indx]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        int nodes []= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(nodes);
        // preorder(root);
        // inorder(root);
        postorder(root);
    }
}
