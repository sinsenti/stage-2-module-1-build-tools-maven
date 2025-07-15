package com.epam.utils;

public class StringUtils {
  public static boolean isPositiveNumber(String str) {
    if (str.length() > 1 && str.startsWith("0") && !str.startsWith("0.")) {
      return false;
    }
    if (str.trim() == null || str.trim().isEmpty())
      return false;
    if (!str.matches("[0-9]+(\\.[0-9]+)?"))
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
