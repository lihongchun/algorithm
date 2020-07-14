package cn.lhc.dynamic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.List;

/**
 * 120. 三角形最小路径和
 * https://leetcode-cn.com/problems/triangle/
 */
public class Q120 {

    /**
     * 三角形最小路径和
     *
     * @param triangle 三角形信息
     * @return 最小路径值
     */
    public static int minimumTotal(List<List<Integer>> triangle) {
        if (null == triangle) {
            return 0;
        }
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }
        int[] arr = new int[triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            List<Integer> s = triangle.get(i);
            for (int j = 0, size = s.size(); j < size; j++) {
                arr[j] = s.get(j) + Math.min(arr[j], arr[j + 1]);
            }
        }
        return arr[0];
    }

    /**
     * 测试方法
     *
     * @param args
     */
    public static void main(String[] args) {
        List<List<Integer>> list = JSON.parseObject("[[2],[3,4],[6,5,7],[4,1,8,3]]", new TypeReference<>() {
        });
        System.out.println(minimumTotal(list));

    }

}
