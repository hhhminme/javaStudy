import java.util.*;
import java.io.*;
public class 실습8_1_2 {
	public static void main(String[] args) {
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Theme2\\img9.jpg");
		File dest = new File("c:\\Temp\\copyimg1.jpg");
		
		try {
			System.out.println("복사 시작...");
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			int src_size = (int) src.length() / 9;
			byte[] buf = new byte[src_size];
			int c = 0;
			while(true) {
				int n =fi.read(buf);
				fo.write(buf,0,n);
				c+=10;
				if( n< buf.length) {
					System.out.println(".."+n + "Byte " + "복사 " + c+"%");
					System.out.println(src.length() + "Byte 복사완료!!");
					break;
				}
				System.out.println(".."+n + "Byte " + "복사 " + c+"%");
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를" + dest.getPath() +"로 복사 했습니다.");
		}catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}
