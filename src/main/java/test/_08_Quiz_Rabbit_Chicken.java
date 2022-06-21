package test;

import java.util.Scanner;
/*
 * 雞兔同籠問題
 * 
 * */
public class _08_Quiz_Rabbit_Chicken {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入頭數: ");
		int heads = sc.nextInt();
		System.out.print("請輸入腳數: ");
		int legs = sc.nextInt();
		int chickens, rabbits;
		
		chickens = (4*heads - legs)/2;
		rabbits = heads - chickens;
		
		System.out.println("雞有 "+ chickens +" 隻");
		System.out.println("兔有 "+ rabbits +" 隻");
	}
}
