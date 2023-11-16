import java.util.ArrayList;

public class RootToLeafPath {
    public void printPath(ArrayList<Integer> list){
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ "-> ");
        }
        System.out.println();
    }

    public void rootToLeafPath(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }

        list.add(root.data);

        if(root.left == null && root.right == null){
            printPath(list);
        }
        else{
            rootToLeafPath(root.left, list);
            rootToLeafPath(root.right, list);
        }
        list.remove(list.size()-1);
    }
}
