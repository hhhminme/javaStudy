package ch_3;
import java.util.Scanner;
public class prob_3_2 {
	public static void main(String[] args) {
		//-1이 입력될 때까지 입력된 수의 평균 구하기 
		System.out.println("-1입력 : 종료");
		System.out.println("수를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		int count = 0; 
		double avg;
		
		while(num != -1) {		
			num = scanner.nextInt();
			if(num != -1) {
				sum += num; 				
				count++;
			}
		}
		System.out.println("avg : "+ (double)(sum/count));
		System.out.println("count :" + count);
	}	
}
