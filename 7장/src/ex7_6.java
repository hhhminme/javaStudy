import java.util.*;
public class ex7_6 {
	public static void main(String[] args) {
		//해쉬맵을 이용하여 학생의 이름과 자바 점수를 기록 관리하는 프로그램을 생성하여라. 
		//사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> stu = new HashMap<>();
		stu.put("홍길동","88");
		stu.put("벡님준","99");
		stu.put("허민","77");
		
		System.out.println("HashMap의 요소 개수 : " + stu.size());
		//모든 사람의 점수 출력 
		//stu에 들어 있는 모든 (key,value) 쌍 출력 
		//key 문자열을 가진 집합 Set 컬렉션 리턴
		Set<String> keys = stu.keySet(); 
		Iterator <String> it = keys.iterator();
		
		while(it.hasNext()) { //모든 요소 방문
			String name = it.next(); //다음 요소 리턴
			String score = stu.get(name);
			System.out.println(name + " : " + score);
		}
	}
}
