package org.example;


/* renamed from: w61  reason: default package */
/* loaded from: classes2.dex */
public class w61 {
    public static final char a = (char) Integer.parseInt("00000011", 2);
    public static final char b = (char) Integer.parseInt("00001111", 2);
    public static final char c = (char) Integer.parseInt("00111111", 2);
    public static final char d = (char) Integer.parseInt("11111100", 2);
    public static final char e = (char) Integer.parseInt("11110000", 2);
    public static final char f = (char) Integer.parseInt("11000000", 2);
    public static final char[] g = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '+', '/'};

    public String a(byte[] bArr) {
        int i = 0;
        int i2;
        StringBuffer stringBuffer = new StringBuffer(((int) (bArr.length * 1.34d)) + 3);
        int i3 = 0;
        char c2 = 0;
        for (int i4 = 0; i4 < bArr.length; i4++) {
            i3 %= 8;
            while (i3 < 8) {
                if (i3 == 0) {
                    i = ((char) (bArr[i4] & d)) >>> 2;
                } else if (i3 == 2) {
                    i = bArr[i4] & c;
                } else if (i3 == 4) {
                    c2 = (char) (((char) (bArr[i4] & b)) << 2);
                    int i5 = i4 + 1;
                    if (i5 < bArr.length) {
                        i2 = (bArr[i5] & f) >>> 6;
                        i = c2 | i2;
                    } else {
                        stringBuffer.append(g[c2]);
                        i3 += 6;
                    }
                } else {
                    if (i3 == 6) {
                        c2 = (char) (((char) (bArr[i4] & a)) << 4);
                        int i6 = i4 + 1;
                        if (i6 < bArr.length) {
                            i2 = (bArr[i6] & e) >>> 4;
                            i = c2 | i2;
                        }
                    }
                    stringBuffer.append(g[c2]);
                    i3 += 6;
                }
                c2 = (char) i;
                stringBuffer.append(g[c2]);
                i3 += 6;
            }
        }
        if (stringBuffer.length() % 4 != 0) {
            for (int length = 4 - (stringBuffer.length() % 4); length > 0; length--) {
                stringBuffer.append("=");
            }
        }
        return stringBuffer.toString();
    }
}