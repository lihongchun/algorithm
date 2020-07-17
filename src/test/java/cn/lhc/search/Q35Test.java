package cn.lhc.search;

import junit.framework.TestCase;
import org.junit.Test;

public class Q35Test extends TestCase {

    private Q35 q35 = new Q35();
    private int[] arr = new int[]{1, 3, 5, 6};

    @Test
    public void testSearchInsert() {
        assertEquals(q35.searchInsert(arr, 5), 2);
        assertEquals(q35.searchInsert(arr, 2), 1);
        assertEquals(q35.searchInsert(arr, 7), 4);
        assertEquals(q35.searchInsert(arr, 0), 0);
    }
}