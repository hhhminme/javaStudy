import java.util.*;
import java.io.*;
public class �ǽ�8_1_2 {
	public static void main(String[] args) {
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Theme2\\img9.jpg");
		File dest = new File("c:\\Temp\\copyimg1.jpg");
		
		try {
			System.out.println("���� ����...");
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
					System.out.println(".."+n + "Byte " + "���� " + c+"%");
					System.out.println(src.length() + "Byte ����Ϸ�!!");
					break;
				}
				System.out.println(".."+n + "Byte " + "���� " + c+"%");
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "��" + dest.getPath() +"�� ���� �߽��ϴ�.");
		}catch(IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}
