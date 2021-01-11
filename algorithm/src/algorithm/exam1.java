package algorithm;
import java.util.*;
public class exam1 {
	   public static int solution(int[][] board, int[] moves) {
	        int answer = 0; 
	        Stack<Integer> m = new Stack<Integer>();
	        for(int i = moves.length-1; i>=0; i--){
	            int mNum = moves[i] - 1;
	            for(int j = 4; j>=0; j--){
	                if(!(board[j][mNum] == 0)){
	                    int temp = board[j][mNum];
	                    if(m.empty()){
	                        m.push(temp);
	                    }
	                    else {
	                    	if(m.peek().equals(temp)) {
		                        answer++;
		                        m.pop();
		                    }
	                    }
	                }   
	            }        
	        }
	        return answer;
	    }
	   public static void main(String[] args) {
		   int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		   int[] moves = {1,5,3,5,1,2,1,4};
		   
		   int result = solution(board,moves);
		   System.out.println(result);
	   }
}
