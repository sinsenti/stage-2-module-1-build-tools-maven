package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
  public static boolean isPositiveNumber(String str) {
    if (str == null) {
      return false;
    }
    if (str.length() > 1 && str.startsWith("0") && !str.startsWith("0.")) {
      return false;
    }
    return NumberUtils.isParsable(str) && Double.parseDouble(str) > 0;
  }
}
