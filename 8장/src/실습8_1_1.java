import java.util.*;
import java.io.*;

public class �ǽ�8_1_1 {
	public static void main(String[] args) {
	try (Scanner scanner = new Scanner(new FileReader("C:\\windows\\system.ini"))) {
		int cnt = 1; 
		System.out.println("C:\\windows\\system.ini ������ �о� ����մϴ�.");
	    while (scanner.hasNext()) {
	        System.out.println(" "+cnt+" : "+scanner.nextLine().toUpperCase());
	        cnt++;
	    }
	} catch (Exception e) {
	    System.err.println("Exception occurred!");
	}
}
}