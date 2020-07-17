package cn.lhc.search;

/**
 * 35. 搜索插入位置
 * https://leetcode-cn.com/problems/search-insert-position/
 */
public class Q35 {


    public int searchInsert(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return begin;
    }

}
