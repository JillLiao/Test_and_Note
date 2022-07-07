package leetcode;

import java.util.function.Function;
import java.util.stream.IntStream;

public class _007_ClimbingStair {
	
	public int climbStairs(int n) {
        int atLess = (n+1)/2; //max ->n
        int ways = 0;
        
        Function<Integer, Integer> factorial = (x) -> {
        	return IntStream.rangeClosed(1,x).reduce(1, (int num1, int num2) -> num1*num2);};
			
		for(int i =1;i<atLess;i++) {
			int x = factorial.apply(n-i);
			int y = factorial.apply(n-(2*i));
			int z = factorial.apply(i);
			ways += x/(y*z);
		}
		
		switch (n%2) {
		case 0:
			ways += 2;
			break;

		case 1:
			ways += 1;
			break;
		}
		
		return ways;
    }
	
	public static void main(String[] args) {
//		int n=6;
//		Function<Integer, Integer> factorial = (x) -> {
//        	return IntStream.rangeClosed(1,n).reduce(1, (int num1, int num2) -> num1*num2);};
		_007_ClimbingStair t=new _007_ClimbingStair();
		System.out.println(t.climbStairs(6));
		
		
		
	}

}
