import java.util.HashSet;
import java.util.Collections;
import java.util.Set;
import java.util.ArrayList;
public class �ǽ�_2 {
		public static void main(String[] args) {
		Set lotto= new HashSet();
		int lotto_num;
		while (lotto.size() != 6) {
			lotto_num = (int)(Math.random()*45 + 1);
			lotto.add(lotto_num);
		}
		ArrayList<Integer> lotto_array = new ArrayList<Integer>(lotto);
		Collections.sort(lotto_array);
		for (Object list:lotto) System.out.println("random number : " + list);
		for (Object list:lotto) System.out.print(list+" ");
		
	}
}