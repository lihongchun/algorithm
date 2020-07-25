package cn.lhc.list;

/**
 * https://leetcode-cn.com/problems/split-array-largest-sum/
 */
public class Q410 {

    /**
     * 410. 分割数组的最大值
     *
     * @param nums 给定数组
     * @param m    分割数组个数
     * @return 最大值
     */
    public int splitArray(int[] nums, int m) {
        int right = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            right += nums[i];
            left = Math.max(left, nums[i]);
        }
        left = Math.max(left, right / m);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (check(nums, m, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    /**
     * @param nums 数字
     * @param m    子数组个数
     * @param max  和最大值
     * @return 是否能达成
     */
    private boolean check(int[] nums, int m, int max) {
        int total = 1;
        int curSum = 0;
        for (int i = 0, len = nums.length; i < len; i++) {
            curSum += nums[i];
            if (curSum > max) {
                curSum = nums[i];
                total++;
                if (total > m) {
                    return false;
                }
            }
        }
        return true;
    }
}
