import java.util.*;
import java.io.*;
public class �ǽ�8_2 {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try{
			fin = new FileInputStream("C:\\Users\\���\\eclipse-workspace\\8��\\b.txt");
			in = new InputStreamReader(fin,"MS949");
			int c; 
			
			System.out.println("���ڵ� ���� ������" + in.getEncoding());
			while((c = in.read()) != -1){
				System.out.print(Character.toLowerCase((char)c));
			}
		} catch(IOException e) {
			System.out.println("����� ����");
		}
	}
}
