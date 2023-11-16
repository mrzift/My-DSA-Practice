public class FindInRange {
    public void findInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if(root.data >= x && root.data <= y){
            findInRange(root.left,x,y);
            System.out.print(root.data+" ");
            findInRange(root.right, x, y);
        } else if (y < root.data) {
            findInRange(root.left,x,y);
        }
        else findInRange(root.right, x, y);
    }
}
