import java.util.*;
public class ex7_5 {
	public static void main(String[] agrs) {
		//���� �ܾ�� �ѱ� �ܾ��� ���� �����ϴ� HashMap �÷��� ���� 
		HashMap<String, String> dic = new HashMap<>();
		
		//3���� (key,value) ���� dic�� ���� 
		dic.put("baby","�Ʊ�");
		dic.put("love","���");
		dic.put("apple","���");
		
		//���� �ܾ �Է¹ް� �ѱ� �ܾ� �˻�. "exit" �Է¹����� ����
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("ã�� ���� �ܾ��?");
			String eng = scanner.next(); 
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			String kor = dic.get(eng);
			if(kor == null){
				System.out.println(eng + "�� ���� �ܾ��Դϴ�.");
			}
			else {
				System.out.println(kor);
			}
		}
	}
}
