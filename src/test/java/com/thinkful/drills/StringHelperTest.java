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
    StringHelper helper3 = new StringHelper("3.14");
    StringHelper helper4 = new StringHelper("-1");

    assertTrue("Integer - 20 should be numeric", helper.isNumeric());
    assertFalse("abc should not be numeric", helper2.isNumeric());
    assertTrue("Real - 3.14 should be numeric", helper3.isNumeric());
    assertTrue("Negative - -1 should be numeric", helper4.isNumeric());
  }

  @Test
  public void containsTest() {
    StringHelper helper = new StringHelper("Here is a test String");
    assertTrue("should contain \"test\"", helper.contains("test"));
    assertTrue("should contain \"Here\"", helper.contains("Here"));
    assertTrue("should contain \"String\"", helper.contains("String"));
    assertTrue("should contain \"re a\"", helper.contains("re a"));
    assertTrue("should contain blank", helper.contains(""));
    assertFalse("should not contain \"there\"", helper.contains("there"));
    assertFalse("should not contain \"Hereis\"", helper.contains("Hereis"));
  }


}