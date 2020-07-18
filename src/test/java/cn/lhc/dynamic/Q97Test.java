package cn.lhc.dynamic;

import junit.framework.TestCase;
import org.junit.Test;

public class Q97Test extends TestCase {

    private Q97 q97 = new Q97();

    @Test
    public void testIsInterleave() {
        assertTrue(q97.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }
}