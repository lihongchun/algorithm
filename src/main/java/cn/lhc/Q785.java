package cn.lhc;

import java.util.LinkedList;

/**
 * 785. 判断二分图
 * https://leetcode-cn.com/problems/is-graph-bipartite/
 */
public class Q785 {

    /**
     * 判断是否为二分图
     *
     * @param graph 图
     * @return 是否
     */
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] flag = new int[n];
        for (int i = 0; i < n; i++) {
            if (flag[i] != 0) {
                continue;
            }
            flag[i] = 1;
            LinkedList<Integer> list = new LinkedList<>();
            list.add(i);
            while (!list.isEmpty()) {
                Integer pop = list.pop();
                int[] arr = graph[pop];
                for (int j = 0, size = arr.length; j < size; j++) {
                    if (flag[arr[j]] == 0) {
                        flag[arr[j]] = -flag[pop];
                        list.push(arr[j]);
                    } else if (flag[arr[j]] == flag[pop]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Q785().isBipartite(new int[][]{new int[]{1, 3}, new int[]{0, 2}, new int[]{1, 3}, new int[]{0, 2}}));
    }
}
