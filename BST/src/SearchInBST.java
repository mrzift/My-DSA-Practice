public class SearchInBST {
    public static boolean search(Node root, int data){
        if(root == null){
            return false;
        }
        else if(root.data == data){
            return true;
        }
        else if (root.data > data){
            return search(root.left, data);
        }
        else{
            return search(root.right, data);
        }
    }

    public static boolean searchIterative(Node root, int data){
        while (root!=null){
            if(root.data == data){
                return true;
            }
            else if (root.data > data) {
                root = root.left;
            }
            else root = root.right;
        }
        return false;
    }
    public static void main(String[] args) {

    }

}
