package homework3_2;
import java.util.Scanner;

public class BankApplicaton {
	private static Account[] accountArr = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성| 2.계좌목록| 3.예금| 4.출금| 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
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
		System.out.println("프로그램종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		String ano, owner;
		int balance;
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		ano = scanner.next(); //계좌번호 입력
		System.out.print("계좌주: ");
		owner = scanner.next(); //계좌주 입력
		System.out.print("초기입금금액: ");
		balance = scanner.nextInt(); //초기금액 입력
		
		for(int i = 0; i<accountArr.length;i++) { //객체배열의 길이만큼 반복
			if(accountArr[i] == null) { //인덱스에 참조값이 null일때 
				accountArr[i] = new Account(ano,owner,balance); //계좌 생성 
				System.out.println("결과: 계좌가생성되었습니다.");
				break; //계속 반복되지 않도록 for문 탈출
			}
		}
		
	}
	
	// 계좌목록보기
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		
		for(int i = 0; i<accountArr.length;i++) {//객체배열의 길이만큼 반복
			if(accountArr[i] == null)//인덱스에 참조값이 null일때
				break; //읽어올 인자가 없으므로 나간다.
			System.out.println(accountArr[i].getAno()+"\t"+accountArr[i].getOwner()+"\t"+accountArr[i].getBalance());
		}
	}

	//예금하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		
		if(findAccount(ano)!=null) { //acc_no 와 동일한 ano가 있다면
			findAccount(ano).setBalance(findAccount(ano).getBalance()+balance); //return된 account의 balance + 입력받은 예금액을 저장한다.
			System.out.println("결과: 예금이성공되었습니다.");
		}
		else { //acc_no와 동일한 ano가 없다면
			System.out.println("결과: 계좌를 찾을 수 없습니다.");
		}
	}

	//출금하기
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		
		int balance = scanner.nextInt();
		if(findAccount(ano)!=null) {//acc_no 와 동일한 ano가 있다면
			if(findAccount(ano).getBalance()-balance >0) { //기존 예금액 - 출금액이 0보다 커야지만 출금이 가능하므로
				findAccount(ano).setBalance(findAccount(ano).getBalance()-balance); // return된 account의 balance - 입력받은 출금액을 저장한다.
				System.out.println("결과: 출금이성공되었습니다.");
			}
			else { //기존 예금액 - 출금액이 0작다면 
				System.out.println("결과: 예금액이 부족합니다.");
			}
		}
		else { //acc_no 와 동일한 ano가 없다면
			System.out.println("결과: 계좌를 찾을 수 없습니다.");
		}
	}
	//Account 배열에서 acc_no 와 동일한 Account 객체찾기
	private static Account findAccount(String acc_no) {
		for(int i =0; i<accountArr.length;i++) {//객체배열의 길이만큼 반복
			if(accountArr[i] == null) {//인덱스에 참조값이 null일때
				break; //읽어올 인자가 없으므로 나간다.
			}
			else if(accountArr[i].getAno().equals(acc_no)) {//acc_no 와 동일한 ano가 있다면
				return accountArr[i]; //ano가 있는 객체 반환
			}
		}
		return null; //ano와 같은 경우가 없을때
	}
}
