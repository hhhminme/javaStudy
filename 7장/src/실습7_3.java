import java.util.*;
public class 실습7_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nation = new HashMap<>();
		System.out.println("나라 이름과 인구를 입력하세요.(예:Korea 5000");
		String nation_name;
		int nation_num;
		while(true) {
			System.out.print("나라 이름 인구 >>");
			nation_name = scanner.next();
			if(nation_name.equals("그만")) break;
			nation_num = scanner.nextInt(); 
			nation.put(nation_name, nation_num);
		}
		while(true) {
			System.out.print("인구 검색 >>"	);
			nation_name = scanner.next();
			if(nation.containsKey(nation_name)) {
				nation_num = nation.get(nation_name);
				System.out.println(nation_name +"의 인구는" + nation_num);
				
			}
			else if(nation_name.equals("그만")) break;
			else if(!nation.containsKey(nation_name)) {
				System.out.println(nation_name+"나라는 없습니다.");
				
			}
		}
		scanner.close();
	}
}
