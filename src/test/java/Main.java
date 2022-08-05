import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;

class Main {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://api.iflynote.com/notes/ocr/result");
		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
		httpConn.setRequestMethod("POST");

		httpConn.setRequestProperty("Host", "api.iflynote.com");
		httpConn.setRequestProperty("Platform", "{\"from\":\"IFLYNOTE_ANDROID\",\"imei\":\"\",\"imsi\":\"\",\"mac\":\"\",\"androidId\":\"660b9b37d840cca1\",\"manufact\":\"OnePlus\",\"netSubtype\":\"none\",\"openUDID\":\"\",\"osSystem\":\"Android\",\"osVersion\":\"30\",\"appVerCode\":\"435\",\"appverName\":\"7.0.1367\",\"product\":\"OnePlus6\",\"resolution\":\"1080*2156\",\"channelId\":\"16010000\"}");
		httpConn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
		httpConn.setRequestProperty("Uid", "7628208014");
		httpConn.setRequestProperty("Authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjIjoiQU5EUk9JRCIsInMiOjE2NTk1ODA3NzczNTcsInQiOiJBIiwidSI6Ijc2MjgyMDgwMTQiLCJpc3MiOiJhdXRoMCIsImV4cCI6MTY1OTY2NzE3N30.Zf6aMlnBsTfKX6922XAPEqTlIg0oVLAG_Q0DcOCrfy8");
		httpConn.setRequestProperty("Content-Length", "1584");
		httpConn.setRequestProperty("Accept-Encoding", "gzip, deflate");
		httpConn.setRequestProperty("User-Agent", "okhttp/4.3.1");
		httpConn.setRequestProperty("Connection", "close");

		httpConn.setDoOutput(true);
		OutputStreamWriter writer = new OutputStreamWriter(httpConn.getOutputStream());
		writer.write("{\"from\":\"IFLYNOTE_ANDROID\",\"checkSum\":\"bcec859c3ef62b22820c1faebefed349\",\"image\":\"iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAMAAACdt4HsAAAARVBMVEVHcEwAAAAAAAD9uc4AAAAAAAAAAAAAAAAAAAAAAAAAAAD/vNL/wNY5Ki7pqr5RO0JuUFmid4TboLLDj5+HY27zssYjGRzrrJAhAAAACnRSTlMA8B3/BUXXkrlr+nOzLQAAA4lJREFUWIXtV9mWnCAQHbVdkM0N//9TQ22AaPckZ06eknqYsSi4XGqD/vr6L39FXiQX7WZ+v1pNLKMqtFG1ZO9HGekf1/fNnGXoh6w0PWw+FebxYX1brq+kiRzGy4i6AwxvFvOO/XVguh8Ahk9Pcs6FduJ8JEADFo54cyWecDckKwLYkBXEt2Q9+FB3Al53KNoRzx10vSPlrG/n0xGGNAHFI8Bi4DtYPrd1oJrlyYkK5wcB0HSGOeCKgwFWIjA/uQAJbDAhOC00eUm3MwCBfyBgcO8DFhk+Ay4xtP4wmcB1+esFBE4k0J02e26eHSqIRnaNBOpURgK4MxweF7niDIS2FCGpPZA3A4/TIvKcNylwRPCRwJgJuGVZil2FtxcCjx7AKjqdJBFH0hRngGTcvyGwmu4qfAbLmUn/H3OgpbTvaoCtiENnvyWAdi2SM4ajv7p3HqAqsrpgzbtySfqQPeOfCBRl5qRqmA8pqcIoMHUI+mIXriCoqlx2FF/U7QOBVyYgO86SNJLOEl/0QN0HMAe8AccZylIOKrqSKmoz5NnHEGAMjxUFGDYtFpalEQLwpBxPIbj18qlu35Xcb5Rqesuk3sitDMWLIthoVMGqmS7XVd2KYxopNaS5Y99GXSlm1QzDPPWTfA/TpEoBsH4oN2uG8eqRplQjRGWd6tvqj+Xzbfg7AD9cjwDnbqSEN8gUn9Q4EO9C+Q47JNWWjVCryIDqEP/AmM+NCQFSKetwSl9NDYsYYA93AAHlTF2YLmEGCC4YLi0EICNUhjDQu7UegOIg9B+9LigeAcJh/RGoGAHAkXGxmQH2AejawWPxcx+Y4T0QqdPhBUBaZYoCMfAebScC6EMeJnBbhsX7le80nGTRWgLgmaPJeble5B0CANHhRlO7sk6LEVxKR8iODRDGNalwkCXFJLJkAI5QAnCJQb5/yM8MgDtqDGPBYJsLAJ229gjgvHjpYKfhrB17rzTKGwAkQNyUfcmyitfJ/QCQ3jsMAJHWR8yDjeLncqRjRwQAZ63lPFi6lCTHUQDEXHOBLxZyU4gCe+30aKLH2Uq3HBoDPgS/quIBdi6rMYPK4nFwTWY9AUR8lM1BvdnNZYkulc9tW6NjjpCNuySSZZHkLSRr7NWzMEoe/Eh+3tLay51Q3QGVNFO93QA/Y1o1sijVt6+2HwtR/dWYJ6MR7oX6B9j732Ng+vBz7d+VXxK4cn1Sf2e7AAAAAElFTkSuQmCC\",\"language\":\"cn|en\",\"location\":\"true\",\"ocrType\":\"general\"}");
		writer.flush();
		writer.close();
		httpConn.getOutputStream().close();

		InputStream responseStream = httpConn.getResponseCode() / 100 == 2
				? httpConn.getInputStream()
				: httpConn.getErrorStream();
		if ("gzip".equals(httpConn.getContentEncoding())) {
			responseStream = new GZIPInputStream(responseStream);
		}
		Scanner s = new Scanner(responseStream).useDelimiter("A");
		String response = s.hasNext() ? s.next() : "";
		System.out.println(response);
	}
}
