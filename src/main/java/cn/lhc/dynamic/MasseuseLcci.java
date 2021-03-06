package cn.lhc.dynamic;

/**
 * https://leetcode-cn.com/problems/the-masseuse-lcci/
 */
public class MasseuseLcci {
    /**
     * 一个有名的按摩师会收到源源不断的预约请求，每个预约都可以选择接或不接。在每次预约服务之间要有休息时间，因此她不能接受相邻的预约。
     * 给定一个预约请求序列，替按摩师找到最优的预约集合（总预约时间最长），返回总的分钟数。
     *
     * @param nums 数组
     * @return 结果
     */
    public int massage(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        int pre1 = 0;
        int pre2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int tem = Math.max(pre1, pre2 + nums[i]);
            pre2 = pre1;
            pre1 = tem;
        }
        return pre1;

    }
}
