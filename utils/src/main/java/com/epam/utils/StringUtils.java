package com.epam.utils;

public class StringUtils {
  public static boolean isPositiveNumber(String str) {
    if (str == null || str.isEmpty())
      return false;
    try {
      return Double.parseDouble(str) > 0;
    } catch (NumberFormatException e) {
      return false;
    } catch (NullPointerException e) {
      return false;
    }
  }
}
