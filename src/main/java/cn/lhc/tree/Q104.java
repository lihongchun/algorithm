package cn.lhc.tree;

/**
 * 104. 二叉树的最大深度
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 */
public class Q104 {
    /**
     * 二叉树的最大深度
     *
     * @param root 二叉树根节点
     * @return 最大深度
     */
    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }

    }
}
