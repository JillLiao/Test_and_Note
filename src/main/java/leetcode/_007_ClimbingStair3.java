package leetcode;

public class _007_ClimbingStair3 {
	public int ways=0; 
	public void climbStairs(int n) {
		int tmpInt;
		if(n<0) return; 
		
		 if(n==0) {
			 ways++;
			 return;
		 }
		 
		 tmpInt = n - 2;
		 climbStairs(tmpInt);
		 
		 tmpInt = n - 1;
		 climbStairs(tmpInt);
	 }
	
	public static void main(String[] args) {
		_007_ClimbingStair3 t = new _007_ClimbingStair3();
		t.climbStairs(20);
		System.out.println(t.ways);
	}
}
