import java.util.*;
public class 실습7_1{
	public static void main(String[] args) {
		System.out.print("(정수-1이 입력될 때까지)>>");
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		int bigNum = 0;
		while(true) {
			int num = scanner.nextInt();
			if(num == -1) {
				break;
			}
			if(num > 0) {
				v.add(num);
			}
			
		}
		bigNum = v.get(0);
		for(int i = 0; i <v.size();i++) {
			System.out.println(v.get(i) + " ");
			if(bigNum <= v.get(i)) {
				bigNum = v.get(i);
			}
		}
		System.out.println("가장 큰 수는 " + bigNum);
		scanner.close();
	}
}