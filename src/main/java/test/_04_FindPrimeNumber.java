package test;

public class _04_FindPrimeNumber {

	public static void main(String[] args) {
		//印出100以內的質數
		boolean[] ifPrime = new boolean [100];
		
		//陣列初始化
		for(int i=0, max=100; i<max; i++) {
			ifPrime[i]= true;
		}
		
		//判斷是否為質數
		for(int i=2, max=100; i<max; i++) {
			if(ifPrime[i-1]) {
				for(int j=2; i*j<=max; j++) {
					ifPrime[i*j-1]=false;
				}
			}
		}
		
		for(int i=1; i< 100;i++) {
			if(ifPrime[i]) {
				System.out.print((i+1)+" ");
			}
		}
	}

}
