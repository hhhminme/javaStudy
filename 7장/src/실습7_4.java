/*
 * Vector 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하라
 * 강수량을 입력하면 벡터에 추가하고 현재 입력된 모든 강수량과 평균을 출력한다.
 * */
import java.util.*;
public class 실습7_4 {
public static void main(String[] args) {
	Vector<Integer> v = new Vector<>();
	Scanner scanner = new Scanner(System.in);
	int rain, sum = 0;
	while(true) {
		System.out.print("강수량 입력(0 입력시 종료) >> ");
		rain = scanner.nextInt();
		if(rain == 0) 
			break;
		v.add(rain);
		for(int i = 0; i<v.size(); i++) {
			System.out.print(v.get(i) +" ");
			sum += v.get(i);
		}
		System.out.println("\n현재 평균 " + sum/v.size());
	}
	scanner.close();
	}
}
