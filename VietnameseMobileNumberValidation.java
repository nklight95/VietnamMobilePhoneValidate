package com.nklight.utils;

import android.support.annotation.Nullable;

import java.util.regex.Pattern;

public class VietnameseMobileNumberValidation {
    private static String VN = "+84";

    public static boolean isEmpty(@Nullable CharSequence value) {
        return value == null || value.length() == 0;
    }

    public static boolean isValidPhone(@Nullable String number) {

        if (isEmpty(number)) {
            return false;
        }

        if (number.startsWith(VN)) {
            number = number.replace("+", "");
            Pattern regex = Pattern.compile("\\b(84|0)+([3|7|8|9|5][0-9]{8})\\b");
            return regex.matcher(number).matches();
        }

        return false;
    }
}


