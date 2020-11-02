package homework_3_1;
import java.util.Scanner;

class Add{  //더하기
	int a , b; 
	public void setValue(int a, int b) { //객체 생성자
		this.a = a; this.b = b;
	}
	public int calculate() {
		return a+b; //맴버 a,b 더한 값 반환
	} 
}
class Sub{ //빼기 
	int a , b; 
	public void setValue(int a, int b) { //객체 생성자
		this.a = a; this.b = b;
	}
	public int calculate() {
		return a-b; //맴버 a,b 뺀 값 반환
	} 
}
class Mul{ //곱하기
	int a , b; 
	public void setValue(int a, int b) { //객체 생성자
		this.a = a; this.b = b;
	}
	public int calculate() {
		return a*b;//맴버 a,b 곱한 값 반환
	} 
}
class Div{ //나누기(몫)
	int a , b; 
	public void setValue(int a, int b) { //객체 생성자
		this.a = a; this.b = b;
	}
	public int calculate() {
		return a/b; //맴버 a,b 나눈 몫 반환
	} 
}
class Mod{ //나누기(나머지)
	int a , b; 
	public void setValue(int a, int b) { //객체 생성자
		this.a = a; this.b = b;
	}
	public int calculate() {
		return a%b; //맴버 a,b 나눈 나머지 반환
	} 
}

public class prob_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하시오");
	
		int a = scanner.nextInt(); //첫번째 수 입력
		int b = scanner.nextInt(); //두번째 수 입력 
		char oper = scanner.next().charAt(0); // 연산자 입력. char이므로 입력받은 문자열의 가장 처음 문자만 입력받아온다.
		
		switch(oper) {
		case('+'): //더하기
			Add add = new Add(); //Add객체 생성 
			add.setValue(a, b); //setValue 메소드를 통해 인자 전달
			System.out.println(add.calculate()); //결과값 출력
			break;
		case('-'): //빼기 
			Sub sub = new Sub();// Sub 객체 생성 
			sub.setValue(a, b); //setValue 메소드를 통해 인자 전달
			System.out.println(sub.calculate());//결과값 출력
			break;
		case('*'): //곱하기
			Mul mul = new Mul(); //Mul 객체 생성 
			mul.setValue(a, b); //setValue 메소드를 통해 인자 전달
			System.out.println(mul.calculate());//결과값 출력
			break;
		case('/'): //나누기(몫)
			Div div = new Div();//Div 객체 생성 
			div.setValue(a, b); //setValue 메소드를 통해 인자 전달
			System.out.println(div.calculate());//결과값 출력
			break;
		case('%')://나누기(나머지)
			Mod mod = new Mod(); //Mod 객체 생성 
			mod.setValue(a, b); //setValue 메소드를 통해 인자 전달
			System.out.println(mod.calculate());//결과값 출력
			break;
		default: //class로 지정되지 않은 연산자 입력시
			System.out.println("해당 연산은 수행할 수 없습니다.");
		}
		scanner.close();
	}
}


