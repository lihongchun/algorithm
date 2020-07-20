package cn.lhc.list;

public class Q167 {
    /**
     * 两数之和 II - 输入有序数组
     *
     * @param numbers 有序数组
     * @param target  目标值
     * @return 下标数组
     */
    public int[] twoSum(int[] numbers, int target) {
        if (null == numbers) {
            return null;
        }
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (sum < target) {
                ++low;
            } else {
                --high;
            }
        }
        return null;
    }

}
