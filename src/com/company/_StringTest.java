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

        boolean isEquals;

        if (newString.equals(expected)){
            isEquals = true;
        }
        else {
            isEquals = false;
        }
        Assert.assertFalse("testReplace is failed", isEquals);
    }

    @Test
    public void testFind() throws Exception {
        _String newString = new _String("Run this test");
        int outIndex = newString.find('u');

        int expected = 2;

        boolean isEquals;

        if (outIndex == expected){
            isEquals = true;
        }
        else {
            isEquals = false;
        }
        Assert.assertFalse("testFind is failed", isEquals);

    }

    @Test
    public void testAppend() throws Exception {
        _String newString = new _String("Run this test");
        newString.append('T');

        _String expected = new _String("Run this testT");

        boolean isEquals;

        if (newString.equals(expected)){
            isEquals = true;
        }
        else {
            isEquals = false;
        }
        Assert.assertFalse("testAppend is failed", isEquals);


    }

    @Test
    public void testRemove() throws Exception {
        _String newString = new _String("Run this test");
        newString.remove('t');

        _String expected = new _String("Run this tes");

        boolean isEquals;

        if (newString.equals(expected)){
            isEquals = true;
        }
        else {
            isEquals = false;
        }
        Assert.assertFalse("testRemove is failed", isEquals);

    }
}