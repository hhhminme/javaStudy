package homework3_2;
import java.util.Scanner;

public class BankApplicaton {
	private static Account[] accountArr = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.���»���| 2.���¸��| 3.����| 4.���| 5.����");
			System.out.println("----------------------------------------------------------");
			System.out.print("����> ");
			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷�����");
	}

	// ���»����ϱ�
	private static void createAccount() {
		String ano, owner;
		int balance;
		System.out.println("--------------");
		System.out.println("���»���");
		System.out.println("--------------");
		System.out.print("���¹�ȣ: ");
		ano = scanner.next(); //���¹�ȣ �Է�
		System.out.print("������: ");
		owner = scanner.next(); //������ �Է�
		System.out.print("�ʱ��Աݱݾ�: ");
		balance = scanner.nextInt(); //�ʱ�ݾ� �Է�
		
		for(int i = 0; i<accountArr.length;i++) { //��ü�迭�� ���̸�ŭ �ݺ�
			if(accountArr[i] == null) { //�ε����� �������� null�϶� 
				accountArr[i] = new Account(ano,owner,balance); //���� ���� 
				System.out.println("���: ���°������Ǿ����ϴ�.");
				break; //��� �ݺ����� �ʵ��� for�� Ż��
			}
		}
		
	}
	
	// ���¸�Ϻ���
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("���¸��");
		System.out.println("--------------");
		
		for(int i = 0; i<accountArr.length;i++) {//��ü�迭�� ���̸�ŭ �ݺ�
			if(accountArr[i] == null)//�ε����� �������� null�϶�
				break; //�о�� ���ڰ� �����Ƿ� ������.
			System.out.println(accountArr[i].getAno()+"\t"+accountArr[i].getOwner()+"\t"+accountArr[i].getBalance());
		}
	}

	//�����ϱ�
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("����");
		System.out.println("--------------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int balance = scanner.nextInt();
		
		if(findAccount(ano)!=null) { //acc_no �� ������ ano�� �ִٸ�
			findAccount(ano).setBalance(findAccount(ano).getBalance()+balance); //return�� account�� balance + �Է¹��� ���ݾ��� �����Ѵ�.
			System.out.println("���: �����̼����Ǿ����ϴ�.");
		}
		else { //acc_no�� ������ ano�� ���ٸ�
			System.out.println("���: ���¸� ã�� �� �����ϴ�.");
		}
	}

	//����ϱ�
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("���");
		System.out.println("--------------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("��ݾ�: ");
		
		int balance = scanner.nextInt();
		if(findAccount(ano)!=null) {//acc_no �� ������ ano�� �ִٸ�
			if(findAccount(ano).getBalance()-balance >0) { //���� ���ݾ� - ��ݾ��� 0���� Ŀ������ ����� �����ϹǷ�
				findAccount(ano).setBalance(findAccount(ano).getBalance()-balance); // return�� account�� balance - �Է¹��� ��ݾ��� �����Ѵ�.
				System.out.println("���: ����̼����Ǿ����ϴ�.");
			}
			else { //���� ���ݾ� - ��ݾ��� 0�۴ٸ� 
				System.out.println("���: ���ݾ��� �����մϴ�.");
			}
		}
		else { //acc_no �� ������ ano�� ���ٸ�
			System.out.println("���: ���¸� ã�� �� �����ϴ�.");
		}
	}
	//Account �迭���� acc_no �� ������ Account ��üã��
	private static Account findAccount(String acc_no) {
		for(int i =0; i<accountArr.length;i++) {//��ü�迭�� ���̸�ŭ �ݺ�
			if(accountArr[i] == null) {//�ε����� �������� null�϶�
				break; //�о�� ���ڰ� �����Ƿ� ������.
			}
			else if(accountArr[i].getAno().equals(acc_no)) {//acc_no �� ������ ano�� �ִٸ�
				return accountArr[i]; //ano�� �ִ� ��ü ��ȯ
			}
		}
		return null; //ano�� ���� ��찡 ������
	}
}
