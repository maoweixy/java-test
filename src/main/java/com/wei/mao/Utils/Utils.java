package com.wei.mao.Utils;

import org.apache.commons.lang3.StringUtils;

public class Utils {
    public static int getDuidSum(String duid) {
        if (StringUtils.isBlank(duid)) {
            return 0;
        }
        if (!duid.matches("[0-9a-f]{32}")) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < duid.length(); i++) {
            sum += Integer.parseInt(String.valueOf(duid.charAt(i)), 16);
        }
        return sum;
    }

    public static boolean checkIfDuidMatchModulo(String duid, String groupConditionValue) {
        String[] parts = groupConditionValue.split(",");
        int divider = Integer.parseInt(parts[0]);
        int remainder = Integer.parseInt(parts[1]);
        return checkIfDuidMatchModulo(duid, divider, remainder);
    }

    public static boolean checkIfDuidMatchModulo(String duid, int divider, int remainder) {
        int duidSum = getDuidSum(duid);
        return duidSum % divider == remainder;
    }
}
