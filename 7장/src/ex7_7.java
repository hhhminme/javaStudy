import java.util.*;

class Student{
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id = id; this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() { 
		return tel;
	}
}
public class ex7_7 {
	public static void main(String[] args) {
		//학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성 
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		//3명의 학생 저장 
		map.put("황기태",new Student(1,"010-111-1111"));
		map.put("허민",new Student(2,"010-222-2222"));
		map.put("홍길동",new Student(3,"010-333-3333"));
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름?");
			String name = scanner.nextLine();
			if(name.equals("exit")) {
				break;
			}
			Student student = map.get(name); //이름에 해당하는 Student 객체 검색 
			if(student == null)
				System.out.println(name + "은 없는 사람입니다.");
			else
				System.out.println("id" + student.getId()+"전화 : " + student.getTel());
		}
		scanner.close();
	} 
}
