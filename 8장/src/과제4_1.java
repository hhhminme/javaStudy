import java.io.*;
import java.util.*; 
class FindArrayList{
	static void find_word(ArrayList<String> arr, String word) {
		ArrayList<String> a = new ArrayList<>();
		int i = a.indexOf(word);
		while(true) {
			i++;
			System.out.println(a.get(i));
		}
	}
}
public class ����4_1 {
	public static void main(String[] args) {
	ArrayList <String> a = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	try (Scanner scanner = new Scanner(new FileReader("C:\\Users\\���\\Desktop\\2020-2\\java\\����4\\words.txt"))) {
		System.out.println("������ �о� ����մϴ�.");
	    while (scanner.hasNext()) {
	        String s = scanner.next();
	        a.add(s);
	    }
	    while(true) {
	    	System.out.print("�ܾ�>>");
	    	String word = sc.next();
	    	if(word.equals("exit")) {
	    		break;
	    	}
	    	else if(a.contains(word)) {
	    		//�Լ� �� �ڸ�
	    	}
	    	else {
	    		System.out.println("�߰��� �� ����");
	    	}
	    }
	    System.out.println("�����մϴ�...");
	} catch (Exception e) {
	    System.err.println("Exception occurred!");
		}
	}
}