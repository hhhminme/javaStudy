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
public class 과제4_1 {
	public static void main(String[] args) {
	ArrayList <String> a = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	try (Scanner scanner = new Scanner(new FileReader("C:\\Users\\허민\\Desktop\\2020-2\\java\\과제4\\words.txt"))) {
		System.out.println("파일을 읽어 출력합니다.");
	    while (scanner.hasNext()) {
	        String s = scanner.next();
	        a.add(s);
	    }
	    while(true) {
	    	System.out.print("단어>>");
	    	String word = sc.next();
	    	if(word.equals("exit")) {
	    		break;
	    	}
	    	else if(a.contains(word)) {
	    		//함수 들어갈 자리
	    	}
	    	else {
	    		System.out.println("발견할 수 없음");
	    	}
	    }
	    System.out.println("종료합니다...");
	} catch (Exception e) {
	    System.err.println("Exception occurred!");
		}
	}
}