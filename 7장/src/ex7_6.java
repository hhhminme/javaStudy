import java.util.*;
public class ex7_6 {
	public static void main(String[] args) {
		//�ؽ����� �̿��Ͽ� �л��� �̸��� �ڹ� ������ ��� �����ϴ� ���α׷��� �����Ͽ���. 
		//����� �̸��� ������ ����ϴ� HashMap �÷��� ����
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> stu = new HashMap<>();
		stu.put("ȫ�浿","88");
		stu.put("������","99");
		stu.put("���","77");
		
		System.out.println("HashMap�� ��� ���� : " + stu.size());
		//��� ����� ���� ��� 
		//stu�� ��� �ִ� ��� (key,value) �� ��� 
		//key ���ڿ��� ���� ���� Set �÷��� ����
		Set<String> keys = stu.keySet(); 
		Iterator <String> it = keys.iterator();
		
		while(it.hasNext()) { //��� ��� �湮
			String name = it.next(); //���� ��� ����
			String score = stu.get(name);
			System.out.println(name + " : " + score);
		}
	}
}
