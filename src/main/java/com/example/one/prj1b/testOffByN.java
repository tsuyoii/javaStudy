package com.example.one.prj1b;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class testOffByN {
    @Test
    public void testOffByN(){
        OffByN oN = new OffByN(5);
        assertTrue(oN.equalChars('f', 'a'));
        assertFalse(oN.equalChars('z', 'x'));
    }
}
