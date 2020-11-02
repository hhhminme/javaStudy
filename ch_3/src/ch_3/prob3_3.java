package ch_3;
//do-while 문 이용 'a'~'z'까지 출력
public class prob3_3 {
	public static void main(String[] args) {
		char ch = 'a';
		
		do {
			System.out.print(ch);
			ch = (char) (ch +1); 
		}while(ch<='z');
	}
}
