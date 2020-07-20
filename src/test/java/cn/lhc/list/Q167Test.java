package cn.lhc.list;

import junit.framework.TestCase;

import java.util.Arrays;

public class Q167Test extends TestCase {

    private Q167 q = new Q167();


    public void testTwoSum() {
        System.out.println(Arrays.toString(q.twoSum(new int[]{1, 2, 3, 4, 5, 6, 7, 96, 97, 99, 100}, 100)));
    }
}