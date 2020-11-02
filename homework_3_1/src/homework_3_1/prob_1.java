package homework_3_1;
import java.util.Scanner;

class Add{  //���ϱ�
	int a , b; 
	public void setValue(int a, int b) { //��ü ������
		this.a = a; this.b = b;
	}
	public int calculate() {
		return a+b; //�ɹ� a,b ���� �� ��ȯ
	} 
}
class Sub{ //���� 
	int a , b; 
	public void setValue(int a, int b) { //��ü ������
		this.a = a; this.b = b;
	}
	public int calculate() {
		return a-b; //�ɹ� a,b �� �� ��ȯ
	} 
}
class Mul{ //���ϱ�
	int a , b; 
	public void setValue(int a, int b) { //��ü ������
		this.a = a; this.b = b;
	}
	public int calculate() {
		return a*b;//�ɹ� a,b ���� �� ��ȯ
	} 
}
class Div{ //������(��)
	int a , b; 
	public void setValue(int a, int b) { //��ü ������
		this.a = a; this.b = b;
	}
	public int calculate() {
		return a/b; //�ɹ� a,b ���� �� ��ȯ
	} 
}
class Mod{ //������(������)
	int a , b; 
	public void setValue(int a, int b) { //��ü ������
		this.a = a; this.b = b;
	}
	public int calculate() {
		return a%b; //�ɹ� a,b ���� ������ ��ȯ
	} 
}

public class prob_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ������ �����ڸ� �Է��Ͻÿ�");
	
		int a = scanner.nextInt(); //ù��° �� �Է�
		int b = scanner.nextInt(); //�ι�° �� �Է� 
		char oper = scanner.next().charAt(0); // ������ �Է�. char�̹Ƿ� �Է¹��� ���ڿ��� ���� ó�� ���ڸ� �Է¹޾ƿ´�.
		
		switch(oper) {
		case('+'): //���ϱ�
			Add add = new Add(); //Add��ü ���� 
			add.setValue(a, b); //setValue �޼ҵ带 ���� ���� ����
			System.out.println(add.calculate()); //����� ���
			break;
		case('-'): //���� 
			Sub sub = new Sub();// Sub ��ü ���� 
			sub.setValue(a, b); //setValue �޼ҵ带 ���� ���� ����
			System.out.println(sub.calculate());//����� ���
			break;
		case('*'): //���ϱ�
			Mul mul = new Mul(); //Mul ��ü ���� 
			mul.setValue(a, b); //setValue �޼ҵ带 ���� ���� ����
			System.out.println(mul.calculate());//����� ���
			break;
		case('/'): //������(��)
			Div div = new Div();//Div ��ü ���� 
			div.setValue(a, b); //setValue �޼ҵ带 ���� ���� ����
			System.out.println(div.calculate());//����� ���
			break;
		case('%')://������(������)
			Mod mod = new Mod(); //Mod ��ü ���� 
			mod.setValue(a, b); //setValue �޼ҵ带 ���� ���� ����
			System.out.println(mod.calculate());//����� ���
			break;
		default: //class�� �������� ���� ������ �Է½�
			System.out.println("�ش� ������ ������ �� �����ϴ�.");
		}
		scanner.close();
	}
}


