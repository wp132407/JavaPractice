/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *   |_SaveLmageFromUrl
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 10. 27.
 * </pre>
 *
 * @author     : Admit
 * @version    : 1.0
 */
public class SaveLmageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String imageUrl = "http://www.nztoday.net/news/photo/201405/580_311_0846.jpg" ;
		
		try {
			URL url = new URL(imageUrl);
			
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/long.png");
			
			// 파일에 write 하기
			int result;
			byte[] buf = new byte[100];
			
			while((result = is.read(buf)) != -1) {
				os.write(buf, 0, result);
			}
			
			System.out.println("ok");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
