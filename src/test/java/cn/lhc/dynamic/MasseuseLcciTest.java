package cn.lhc.dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class MasseuseLcciTest {
    private MasseuseLcci masseuseLcci = new MasseuseLcci();

    @Test
    public void massage() {
        System.out.println(masseuseLcci.massage(new int[]{1, 2, 3, 1}));
        System.out.println(masseuseLcci.massage(new int[]{2, 1, 4, 5, 3, 1, 1, 3}));
    }
}