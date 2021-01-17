package algorithm;
import java.util.*;
public class exam1 {
	    public static int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[3];
	        ArrayList <Integer> list = new ArrayList<>();
	        int i,j,k;
	        for(int index = 0; index < 3; index++){
	            i = commands[index][0] - 1;
	            j = commands[index][1] - 1;
	            k = commands[index][2] - 1;
	            for(int q = i; q<j;q++){
	                list.add(array[q]);
	            }
	            Collections.sort(list);
	            answer[index] = list.get(k);
	            list.clear();
	        }
	        
	        return answer;
	    }
	   public static void main(String[] args) {
		   int[] array = {1, 5, 2, 6, 3, 7, 4};
		   int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		   
		   System.out.println(solution(array,commands));
		   }
	   }

