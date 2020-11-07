import java.util.*;
import java.io.*;
public class 실습8_2 {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try{
			fin = new FileInputStream("C:\\Users\\허민\\eclipse-workspace\\8장\\b.txt");
			in = new InputStreamReader(fin,"MS949");
			int c; 
			
			System.out.println("인코딩 문자 집합은" + in.getEncoding());
			while((c = in.read()) != -1){
				System.out.print(Character.toLowerCase((char)c));
			}
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
