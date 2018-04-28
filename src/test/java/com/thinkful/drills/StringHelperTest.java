package com.thinkful.drills;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.thinkful.drills.StringHelper;

import org.junit.Test;

public class StringHelperTest {
  @Test
  public void isNumericTest() {
    StringHelper helper = new StringHelper();

    assertTrue("20 should be numeric", helper.isNumeric("20"));
    assertFalse("abc should not be numeric", helper.isNumeric("abc"));
  }


}