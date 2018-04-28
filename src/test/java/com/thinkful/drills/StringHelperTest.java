package com.thinkful.drills;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.thinkful.drills.StringHelper;

import org.junit.Test;

public class StringHelperTest {
  @Test
  public void isNumericTest() {
    StringHelper helper = new StringHelper("20");
    StringHelper helper2 = new StringHelper("abc");

    assertTrue("20 should be numeric", helper.isNumeric());
    assertFalse("abc should not be numeric", helper2.isNumeric());
  }


}