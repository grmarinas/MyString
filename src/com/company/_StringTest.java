package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by marina on 23.04.15.
 */
public class _StringTest {


    @Test
    public void testReplace() throws Exception {
        _String newString = new _String("Run this test");
        newString.replace(' ', '_');

        _String expected = new _String("Run_this_test");

        Assert.assertFalse("testReplace is failed", newString.equals(expected));
    }

    @Test
    public void testFind() throws Exception {
        _String newString = new _String("Run this test");
        int outIndex = newString.find('u');

        int expected = 2;

        Assert.assertFalse("testFind is failed", newString.equals(outIndex == expected));

    }

    @Test
    public void testAppend() throws Exception {
        _String newString = new _String("Run this test");
        newString.append('T');

        _String expected = new _String("Run this testT");

        Assert.assertFalse("testAppend is failed", newString.equals(expected));

    }

    @Test
    public void testRemove() throws Exception {
        _String newString = new _String("Run this test");
        newString.remove('t');

        _String expected = new _String("Run this tes");

        Assert.assertFalse("testRemove is failed", newString.equals(expected));

    }
}