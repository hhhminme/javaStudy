package ch_3;
import java.util.Scanner;
public class prob_3_2 {
	public static void main(String[] args) {
		//-1�� �Էµ� ������ �Էµ� ���� ��� ���ϱ� 
		System.out.println("-1�Է� : ����");
		System.out.println("���� �Է����ּ���");
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
