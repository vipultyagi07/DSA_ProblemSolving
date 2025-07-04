package topics.tree.BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static topics.tree.BST.B6_102_Binary_Tree_Level_Order_Traversal.Solution.levelOrder;

public class B6_102_Binary_Tree_Level_Order_Traversal {

    static class Solution {
        static List<List<Integer>>  levelOrder(TreeNode root) {

            List<List<Integer>> result = new ArrayList<>();


            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(!queue.isEmpty())
            {

                List<Integer>  list = new ArrayList<>();

                TreeNode curr = queue.poll();
                if(curr.left!=null)list.add(curr.left.val);
                if(curr.right!=null)list.add(curr.right.val);

                result.add(list);

                if(curr.left!=null)queue.add(curr.left);
                if(curr.right!=null)queue.add(curr.right);


            }
            return result;

        }
    }


    public static void main(String[] args) {

        // Manually create a tree like this:
        //       3
        //      / \
        //     9   20
        //        / \
        //       15  17

        TreeNode root = getTreeNode();


        List<List<Integer>> lists = levelOrder(root);// Output: 1 2 3 4 5

        System.out.println(lists);
    }

    private static TreeNode getTreeNode() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(17);
        return root;
    }

}
