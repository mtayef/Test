package test;

import java.util.*;

public class Testing123 {
	
	/*One input parameter can be 5 or 8?
	If input 5 should return 8 and if input 8 should return 5 vice versa? 
	And in that function, no loop, no condition, no switch?*/
	
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println(solve(n.nextInt()));
		n.close();

	}
	public static int solve(int n) {
		int a = n == 5 ? 8 : 5;
		return a;
	}

}