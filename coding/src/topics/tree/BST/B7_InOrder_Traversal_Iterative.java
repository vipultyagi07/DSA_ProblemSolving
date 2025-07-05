package topics.tree.BST;


import java.util.*;

public class B7_InOrder_Traversal_Iterative {


    public static void inOrder(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // Traverse to the leftmost node
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Process node and move to right
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }

        System.out.println(result);



    }




    public static void main(String[] args) {

        // Manually create a tree like this:
        //       1
        //      / \
        //     2   3
        //    / \    \
        //   4   5    6

        TreeNode root = getTreeNode();

        inOrder(root); // Output: 1 2 3 4 5
    }

    private static TreeNode getTreeNode() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }

    }
