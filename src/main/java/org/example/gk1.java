package org.example;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: gk1  reason: default package */
/* loaded from: classes2.dex */
public class gk1 {
    public static byte[] a(String str) {
        return lk1.b(str);
    }

    public static MessageDigest b(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static byte[] c(String str) {
        return a(a(str));
    }

    public static String d(String str) {
        return jk1.b(c(str));
    }

    public static MessageDigest a() {
        return b("MD5");
    }

    public static byte[] a(byte[] bArr) {
        return a().digest(bArr);
    }
}