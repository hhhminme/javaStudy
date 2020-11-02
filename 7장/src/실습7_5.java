import java.util.*;
class Stu{
	private String name; 
	private String major; 
	private String stuNum;
	private double grade;
	
	public Stu(String name, String major, String stuNum, double grade){
		this.name = name; this.major = major;
		this.stuNum = stuNum; this.grade = grade;
	}
	public String get_name() {
		return name;
	}
	public String get_major() {
		return major;
	}
	public String get_stuNum() {
		return stuNum;
	}
	public double get_grade() {
		return grade;
	}
	public void find_student(String name) {
		if(this.name.equals(name)) {
			System.out.println("이름 : " + name);
			System.out.println("학과 : " + major);
			System.out.println("학번 : " + stuNum);
			System.out.println("학점평균 : " + grade);
		}
	}

	
}

public class 실습7_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stu[] student = new Stu[4];
		ArrayList<Stu> stdArr = new ArrayList<>();
		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요");
		
			for(int i = 0; i<student.length;i++) {
				System.out.print(">>");
				String txt = sc.nextLine();
				StringTokenizer st = new StringTokenizer(txt,",");
				String name = st.nextToken().trim();
				String major = st.nextToken().trim();
				String stuNum = st.nextToken().trim();
				double grade = Double.parseDouble(st.nextToken());
				
				student[i] = new Stu(name,major,stuNum,grade);
				stdArr.add(student[i]);
			}
			for(int i = 0; i<stdArr.size();i++) {
				System.out.println("--------------------");
				Stu s = stdArr.get(i);
				System.out.println("이름 : " + s.get_name());
				System.out.println("학과 : " + s.get_major());
				System.out.println("학번 : " + s.get_stuNum());
				System.out.println("학점평균 : " + s.get_grade());
			}
			System.out.println("-------------------");
			while(true) {
				System.out.print("학생 이름>>");
				String name = sc.next();
				if(name.equals("그만")) { 
					System.out.println("존재하지 않는 학생");
					break;
				}
				for(int i = 0; i<stdArr.size();i++) {
					Stu s = stdArr.get(i);
					s.find_student(name);
			}
		}
	}
}
