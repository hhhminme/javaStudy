import java.io.*;
import java.util.*; 
class ����4_1 {
	public static void main(String[] args) {
	ArrayList <String> a = new ArrayList<>(); //ArrayList ��ü a ����
	Scanner sc = new Scanner(System.in); //Scanner ��ü sc ����
	//�����ּҷκ��� ������ �д� FileReader ���� �� Scanner ��ü�� ����  �о����  
	try (Scanner scanner = new Scanner(new FileReader("C:\\Users\\���\\Desktop\\2020-2\\java\\����4\\words.txt"))) { 
		System.out.println("������ �о� ����մϴ�.");
		// input�� �ٸ� token�� ������ ���� String ��ü s�� next complete token�� �о����.
	    while (scanner.hasNext()) {
	        String s = scanner.next();
	        a.add(s); //�о�帰 String�� ArrayList ��ü a�� ����
	    }
	    while(true) {
	    	System.out.print("�ܾ�>>");
	    	String word = sc.next(); //word�� �˻��� ���ڿ� �Է�
	    	if(word.equals("exit")) { //word�� exit�̸� �ݺ����� �������� ���α׷��� ����ȴ�. 
	    		break;
	    	}
	    	else if(a.contains(word)) { //�˻��� �ܾ �����ϴ� ���ڿ� ã��
	    		//�Լ� �� �ڸ�
	    		find_word(a,word); //���� �ܾ� �˻� �Լ�
	    	}
	    	else {
	    		System.out.println("�߰��� �� ����");
	    	}
	    }
	    System.out.println("�����մϴ�...");
	    scanner.close();
	} catch (Exception e) {
	    System.err.println("Exception occurred!");
		}
	}
	private static void find_word(ArrayList<String> a, String findWord) {//findWord�� �˻��ϰ��� �ϴ� �ܾ�
		for(int i = 0; i< a.size();i++) { //ArrayList�� size ��ŭ index�� ó������ 1�� �����ϸ� �˻�
			String word = a.get(i); // ArrayList a�� i �ε��� ��Ҹ� word�� ����
			if(word.length() < findWord.length()) //ArrayList�� ���ڿ��� findWord���� ª�����
				continue;
			String front = word.substring(0,findWord.length()); //ArrayList ���ڿ��� �պκ��� findWord ũ�⸸ŭ �߶󳽴�. 
			if(findWord.equals(front)){ //findWord�� �߶� ���ڿ� ��
				System.out.println(word); //������ �ش�ܾ� ���
			}
			
		}
		
	}
}