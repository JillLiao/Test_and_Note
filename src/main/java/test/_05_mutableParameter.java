package test;

public class _05_mutableParameter {
	
	public static int add(int ... a) {
		int sum = 0;
		for(int i=0, lens=a.length; i<lens; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static int multiply(int[] m) {
		int result = 1;
		for(int i=0, lens=m.length; i<lens; i++) {
			result *= m[i];
		}
		return result;
	}
		
	public static void main(String[] args) {
		int r1= add(1,2,3);
		
		int [] mm = {5,2,10};
		int r2= multiply(mm);
		System.out.println(r1+" , "+r2);
	}

}
