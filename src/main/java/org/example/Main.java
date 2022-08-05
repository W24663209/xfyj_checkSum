package org.example;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    }


    /**
     * @Description 返回getCheckSum
     * @CreatedBy weizongtang
     * @CreateTime 2022/08/04 16:53:52
     */
    public static String getCheckSum(String base64) throws IOException {
        return gk1.d(base64);
    }

    /**
     * @Description 返回图片base64
     * @CreatedBy weizongtang
     * @CreateTime 2022/08/04 16:55:09
     */
    public static String getImageBase64(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        byte[] m = a(fileInputStream);
        fileInputStream.close();
        return new w61().a(m);
    }

    public static byte[] a(FileInputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}