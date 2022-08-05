package org.example;

import java.io.UnsupportedEncodingException;

/* renamed from: lk1 */
/* loaded from: classes2.dex */
public class lk1 {
    public static byte[] a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            throw a(str2, e);
        }
    }

    public static byte[] b(String str) {
        return a(str, "UTF-8");
    }

    public static boolean c(String str) {
        return d(String.valueOf(str.charAt(str.length() - 1)));
    }

    public static boolean d(String str) {
        return str.matches("^[a-zA-Z]*");
    }

    public static boolean e(String str) {
        return d(String.valueOf(str.charAt(0)));
    }

    public static boolean f(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static IllegalStateException a(String str, UnsupportedEncodingException unsupportedEncodingException) {
        return new IllegalStateException(str + ": " + unsupportedEncodingException);
    }

    public static String a(String str) {
        if (str != null || str.length() <= 6) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i >= 3 && i <= 6) {
                sb.append('*');
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}