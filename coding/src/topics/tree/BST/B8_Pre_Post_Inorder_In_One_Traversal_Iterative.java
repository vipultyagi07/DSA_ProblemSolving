package topics.tree.BST;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Pair{

    TreeNode node;
    int state;

    Pair(TreeNode node, int state){
        this.node= node;
        this.state= state;
    }

}

public class B8_Pre_Post_Inorder_In_One_Traversal_Iterative {


    public static List<List<Integer>> treeTraversal(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer>  pre = new ArrayList<>();
        List<Integer>  in = new ArrayList<>();
        List<Integer>  post = new ArrayList<>();

        Stack<Pair> stack = new Stack<>();


        stack.push(new Pair(root,1));

        while(!stack.isEmpty()){

            Pair top = stack.pop();

            if(top.state==1){

                pre.add(top.node.val);
                top.state++;
                stack.push(top);
                if(top.node.left!=null){
                    stack.push(new Pair(top.node.left,1));
                }

            }
            else if(top.state==2){

                in.add(top.node.val);
                top.state++;
                stack.push(top);
                if(top.node.right!=null){
                    stack.push(new Pair(top.node.right,1));
                }

            }
            else{

                post.add(top.node.val);
            }


        }

        result.add(pre);
        result.add(in);
        result.add(post);

        System.out.println(result);

        return result;


    }




    public static void main(String[] args) {

        // Manually create a tree like this:
        //       1
        //      / \
        //     2   3
        //    / \    \
        //   4   5    6

        TreeNode root = getTreeNode();

        treeTraversal(root); // Output: 1 2 3 4 5
    }

    private static TreeNode getTreeNode() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }

    }
