package test;

import java.util.Scanner;

public class _06_Bitwise {

	public static void main(String[] args) {
		//以位元運算 (&) 架設停車場的車位管理系統
/*
 * 	車位編號n (2的n次方)	 4	 3	 2	 1	 0
 * 					-------------------------
 * 	目前停車狀況			 1	 0	 0	 1	 0	→　1號、4號車格有車，二進制表示為:0b10010 → 十進制表示為:18
 * 	若想停2號車位..		&	 0	 0	 1	 0	 0
 * 					-------------------------
 * 						 0	 0	 0	 0	 0	→　經過 & 位元運算後，總值為0，表示2號車位沒有車，所以可以停車
 * 
 * 	目前停車狀況			 1	 0	 0	 1	 0	→　1號、4號車格有車，二進制表示為:0b10010 → 十進制表示為:18
 * 	若想停4號車位..		&	 1	 0	 0	 0	 0
 * 					-------------------------
 * 						 1	 0	 0	 0	 0	→　經過 & 位元運算後，總值為16，而非0，表示4號車位已有車，不能停 
 * 
 * */
				
		int slot =0b10010;		//目前1號、4號車格有車
//		System.out.print(slot);
//		System.out.print(" → ");
//		System.out.println(Integer.toBinaryString(slot));
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入停車格編號: ");
		int n = sc.nextInt();
		int park =(int) Math.pow(2, n);
			
		int check = slot & park;
		if(check ==0) {
			System.out.println("可以停車");
			slot = slot + park;	//車子停進指定車格
			
			System.out.print(slot);
			System.out.print(" → ");
			System.out.println(Integer.toBinaryString(slot));
		}else {
			System.err.println("本車格使用中，請選擇其他車格");
		}				
	}

}
