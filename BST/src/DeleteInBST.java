public class DeleteInBST {
    public static Node getInSucc(Node root){
        Node curr = root.right;
        while(curr != null && curr.left != null){
            return curr.right;
        }
        return curr;
    }
    public static Node delete(Node root, int value){
        if (root == null) {
            return null;
        }
        if(root.data > value){
            root.left = delete(root.left, value);
        }
        else if (root.data < value) {
            root.right = delete(root.right, value);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else {
                Node inorderSucc = getInSucc(root);
                root.data = inorderSucc.data;
                root.right = delete(root.right, inorderSucc.data);
            }
        }
        return root;
    }
    public static void main(String[] args) {

    }
}
