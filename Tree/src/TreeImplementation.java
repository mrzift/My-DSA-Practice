import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
public class TreeImplementation {
    // Build a Tree from its Preorder traversal
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

    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(heightOfTree(root.left),heightOfTree(root.right)) + 1;
    }
    public static void kthNode(Node root, int k){ // Inefficient. O(h*n) T.C.
        if(root == null){
            return;
        }
        if(k==0){
            System.out.print(root.data + " ");
        }
        else{
            kthNode(root.left, k-1);
            kthNode(root.right, k-1);
        }
    }
    public static void LOT(Node root){ // Inefficient. O(h*n) T.C.
        int size = heightOfTree(root);
        System.out.println(root.data);
        for(int i = 1; i<=size; i++){
            kthNode(root, i);
            System.out.println();
        }
    }

    public static void LOT2(Node root){ // the data is not printed line by line.
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
        System.out.println();
    }

    public static void LOT3(Node root){ // the data is printed line by line.
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (q.size()>1){
            Node curr = q.poll();
            if(curr == null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.data + " ");
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
    static int count = 0;
    public static int countSize1(Node root){ // the method works but you need a static variable
                                            //outside the function.
        if(root==null){
            return 0;
        }
        count++;
        countSize1(root.left);
        countSize1(root.right);
        return count;
    }

    public static int countSize2(Node root){ // better function, TC = o(n) ; AS = O(h)
        if(root == null){
            return 0;
        }
        return (countSize2(root.left)+countSize2(root.right))+1;
    }

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        return (sumOfNodes(root.left)+sumOfNodes(root.right))+root.data;
    }

    public static int maxValue(Node root){ /* can also be implemented using LOT. compare the popped item
    with current item and store the max value. in the end return the max value.*/
        if(root == null){
            return 0;
        }
        return Math.max(Math.max(maxValue(root.left), maxValue(root.right)),root.data);
    }

    public static int maxVal(Node root){ // the data is printed line by line.
        if (root == null){
            return -1;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int maxval = 0;
        while (q.size()>1){
            Node curr = q.poll();
            if(curr!=null) {
                maxval = Math.max(maxval, curr.data);
            }
            if(curr == null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.data + " ");
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
        System.out.println();
        return maxval;
    }
    static int maxLevel = 0;
    public static void leftView(Node root, int level){
        if(root==null){
            return;
        }
        if(maxLevel < level) {
            System.out.println(root.data + " ");
            maxLevel = level;
        }
        leftView(root.left , level+1);
        leftView(root.right, level+1);

    }

    public static void leftViewIterative(Node root) {
        Queue<Node> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (i == 0) {
                    System.out.print(curr.data + " ");
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
//        Node root = new Node(10);
//        root.left = new Node(20);
//        root.right = new Node(30);
//        root.left.left = new Node(40);
        int nodes []= {10,8,-1,-1,30,40,-1,-1,50,-1,7,-1,-1};
        //int nodes []= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(nodes);
//        System.out.println(root.data);
//        System.out.println(heightOfTree(root));
//        kthNode(root,2);
        LOT(root);
//        LOT2(root);
//        LOT3(root);
//        System.out.println(countSize1(root));
//        System.out.println(countSize2(root));
//        System.out.println(sumOfNodes(root));
//        System.out.println(maxValue(root));
//        System.out.println(maxVal(root));
//        leftView(root,1);
        leftViewIterative(root);

    }


}
