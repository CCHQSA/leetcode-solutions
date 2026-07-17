package LeetCode.easy;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1022 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public int sumRootToLeaf(TreeNode root) {
        List<String> binaryNums = new ArrayList<>();
        while (root.left != null){
            binaryNums.add(Integer.toBinaryString(root.left.val));
        }
        return 0;
    }

}
