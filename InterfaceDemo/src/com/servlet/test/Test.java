package com.servlet.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String path = "http://localhost:8080/InterfaceDemo/getage?name=yaohongzhi";
				try {
					URL url = new URL(path.trim());
					HttpURLConnection urlConnection = (HttpURLConnection) url
							.openConnection();

					if (200 == urlConnection.getResponseCode()) {
						InputStream is = urlConnection.getInputStream();
						ByteArrayOutputStream baos = new ByteArrayOutputStream();
						byte[] buffer = new byte[1024];
						int len = 0;
						while (-1 != (len = is.read(buffer))) {
							baos.write(buffer, 0, len);
							baos.flush();
						}
						System.out.println(baos.toString("utf-8"));
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
	}

}
