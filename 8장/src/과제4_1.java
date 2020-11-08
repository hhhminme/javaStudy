import java.io.*;
import java.util.*; 
class 과제4_1 {
	public static void main(String[] args) {
	ArrayList <String> a = new ArrayList<>(); //ArrayList 객체 a 생성
	Scanner sc = new Scanner(System.in); //Scanner 객체 sc 생성
	//파일주소로부터 파일을 읽는 FileReader 생성 후 Scanner 객체를 통해  읽어들임  
	try (Scanner scanner = new Scanner(new FileReader("C:\\Users\\허민\\Desktop\\2020-2\\java\\과제4\\words.txt"))) { 
		System.out.println("파일을 읽어 출력합니다.");
		// input에 다른 token이 있을때 까지 String 객체 s에 next complete token을 읽어들임.
	    while (scanner.hasNext()) {
	        String s = scanner.next();
	        a.add(s); //읽어드린 String을 ArrayList 객체 a에 삽입
	    }
	    while(true) {
	    	System.out.print("단어>>");
	    	String word = sc.next(); //word에 검색할 문자열 입력
	    	if(word.equals("exit")) { //word가 exit이면 반복문을 빠져나와 프로그램이 종료된다. 
	    		break;
	    	}
	    	else if(a.contains(word)) { //검색한 단어를 포함하는 문자열 찾기
	    		//함수 들어갈 자리
	    		find_word(a,word); //포함 단어 검색 함수
	    	}
	    	else {
	    		System.out.println("발견할 수 없음");
	    	}
	    }
	    System.out.println("종료합니다...");
	    scanner.close();
	} catch (Exception e) {
	    System.err.println("Exception occurred!");
		}
	}
	private static void find_word(ArrayList<String> a, String findWord) {//findWord는 검색하고자 하는 단어
		for(int i = 0; i< a.size();i++) { //ArrayList의 size 만큼 index를 처음부터 1씩 증가하며 검색
			String word = a.get(i); // ArrayList a의 i 인덱스 요소를 word에 저장
			if(word.length() < findWord.length()) //ArrayList의 문자열이 findWord보다 짧은경우
				continue;
			String front = word.substring(0,findWord.length()); //ArrayList 문자열의 앞부분을 findWord 크기만큼 잘라낸다. 
			if(findWord.equals(front)){ //findWord와 잘라낸 문자열 비교
				System.out.println(word); //같으면 해당단어 출력
			}
			
		}
		
	}
}