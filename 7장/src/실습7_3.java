import java.util.*;
public class �ǽ�7_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nation = new HashMap<>();
		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��:Korea 5000");
		String nation_name;
		int nation_num;
		while(true) {
			System.out.print("���� �̸� �α� >>");
			nation_name = scanner.next();
			if(nation_name.equals("�׸�")) break;
			nation_num = scanner.nextInt(); 
			nation.put(nation_name, nation_num);
		}
		while(true) {
			System.out.print("�α� �˻� >>"	);
			nation_name = scanner.next();
			if(nation.containsKey(nation_name)) {
				nation_num = nation.get(nation_name);
				System.out.println(nation_name +"�� �α���" + nation_num);
				
			}
			else if(nation_name.equals("�׸�")) break;
			else if(!nation.containsKey(nation_name)) {
				System.out.println(nation_name+"����� �����ϴ�.");
				
			}
		}
		scanner.close();
	}
}
