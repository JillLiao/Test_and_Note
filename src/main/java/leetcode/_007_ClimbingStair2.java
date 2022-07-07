package leetcode;

import java.util.function.Function;

public class _007_ClimbingStair2 {
	
	public int climbStairs(int n) {
        int atLess = (n+1)/2; //max ->n
        int ways = 0;
        
        
        
        Function<Integer, Integer> factorial = (x) -> {
	        	int fact=1;	
	        	for(int i=1;i<=x;i++) {
        			fact = fact*i;
        		}
	        	return fact;};
	        	
	    int x,y,z;
		for(int i =1;i<atLess;i++) {
			x = factorial.apply(n-i);
			y = factorial.apply(n-(2*i));
			z = factorial.apply(i);
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
//		int n=7;
//		int atLess = (n+1)/2; //max ->n
//        int ways = 0;
//        
//        Function<Integer, Integer> factorial = (x) -> {
//	        	int fact=1;	
//	        	for(int i=1;i<=x;i++) {
//        			fact = fact*i;
//        		}
//	        	return fact;};
//			
//		for(int i =1;i<atLess;i++) {
//			int x = factorial.apply(n-i);
//			int y = factorial.apply(n-(2*i));
//			int z = factorial.apply(i);
//			ways += x/(y*z);
//		}
//		System.out.println("ways="+ways);
//		switch (n%2) {
//		case 0:
//			ways += 2;
//			break;
//
//		case 1:
//			ways += 1;
//			break;
//		}
		_007_ClimbingStair2 t=new _007_ClimbingStair2();
		System.out.println(t.climbStairs(7));
		
//		System.out.println("ways final="+ways);
		
	}
	
	
	

}
