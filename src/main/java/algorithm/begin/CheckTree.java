package algorithm.begin;

/**
 * 给你一个 二叉树 的根结点 root，该二叉树由恰好 3 个结点组成：根结点、左子结点和右子结点。
 * 如果根结点值等于两个子结点值之和，返回 true ，否则返回 false 。
 */
public class CheckTree {
    public static void main(String[] args) {
        CheckTree checkTree = new CheckTree();
        // 创建测试用例1: 根节点值为3，左子节点值为1，右子节点值为2
        TreeNode root1 = new TreeNode(3, new TreeNode(1), new TreeNode(2));
        System.out.println("Test Case 1: " + checkTree.checkTree(root1)); // 应输出 true

        // 创建测试用例2: 根节点值为5，左子节点值为2，右子节点值为3
        TreeNode root2 = new TreeNode(5, new TreeNode(2), new TreeNode(3));
        System.out.println("Test Case 2: " + checkTree.checkTree(root2)); // 应输出 true

        // 创建测试用例3: 根节点值为10，左子节点值为6，右子节点值为3
        TreeNode root3 = new TreeNode(10, new TreeNode(6), new TreeNode(3));
        System.out.println("Test Case 3: " + checkTree.checkTree(root3)); // 应输出 false
    }

    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
