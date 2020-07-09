package cn.lhc.dynamic;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/re-space-lcci/
 */
public class ReSpaceLcci {

    /**
     * 哦，不！你不小心把一个长篇文章中的空格、标点都删掉了，并且大写也弄成了小写。像句子"I reset the computer. It still didn’t boot!"已经变成了"iresetthecomputeritstilldidntboot"。在处理标点符号和大小写之前，你得先把它断成词语。当然了，你有一本厚厚的词典dictionary，不过，有些词没在词典里。假设文章用sentence表示，设计一个算法，把文章断开，要求未识别的字符最少，返回未识别的字符数。
     *
     * @param dictionary
     * @param sentence
     * @return
     */
    public int reSpace(String[] dictionary, String sentence) {
        if (null == sentence || sentence.length() == 0) {
            return 0;
        }
        if (null == dictionary || dictionary.length == 0) {
            return 0;
        }
        Set<String> dict = new HashSet<>(Arrays.asList(dictionary));
        int maxL = dict.stream().mapToInt(String::length).max().getAsInt();
        int n = sentence.length();
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int idx = Math.max(0, i - maxL); idx < i; idx++) {
                if (dict.contains(sentence.substring(idx, i))) {
                    dp[i] = Math.min(dp[i], dp[idx]);
                }
            }
        }
        return dp[n];
    }

    //        输入：
//        dictionary = ["looked","just","like","her","brother"]
//        sentence = "jesslookedjustliketimherbrother"
//        输出： 7
//        解释： 断句后为"jess looked just like tim her brother"，共7个未识别字符。
    public static void main(String[] args) {


    }
}
