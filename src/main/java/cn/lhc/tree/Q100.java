package cn.lhc.tree;

/**
 * 相同的树
 */
public class Q100 {
    /**
     * 判断两颗树是否相同
     *
     * @param p 树1
     * @param q 树2
     * @return 是否相同
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (null == p && null == q) {
            return true;
        }
        if (null == p || null == q) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
