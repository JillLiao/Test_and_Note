package test;

import java.util.Random;
import java.util.Scanner;
/*題目：
 * 設計一個遊戲
 * step1: 按下enter開始遊戲
 * step2: 玩家有2顆骰子，擲出7, 11點時 win，若點數為2, 3, 12 時 lose
 * step3: 若點數不在上列，則將此點數記錄下來作為目標，之後不斷的重新擲骰子，若結果為紀錄之點數則玩家 win，
 * 			若擲出的點數為7則玩家 lose
 * */
class Game{
	boolean gameContinue = true;	//控制遊戲是否繼續
	int condition =0;	//第二局後的獲勝條件
	int cycle =1;	//局數計算
	
	public void start() throws InterruptedException {
		gameLoop:
			while (gameContinue) {
				System.out.print("Please press enter to start the game...");
				gamming();
				Scanner sc = new Scanner(System.in);
				
				restartGame:
					while (true) {
						System.out.println("請問是否繼續遊戲？ y/n");
						String answer = sc.next();
						
						switch (answer) {
						case "y":
							cycle = 1;
							condition =0;
							gameContinue = true;	//將所有參數初始化
							break restartGame;	//跳離restartGame迴圈，藉由gameLoop使程式回到第19行，重新開始遊戲
							
						case "n":					
							break gameLoop;	//跳離gameLoop，讓遊戲徹底結束
							
						default:
							System.out.println("錯誤！請重新輸入選項");
							break;	//跳離本次switch，讓程式藉由迴圈回到第26行，讓User重新輸入選項
						}
					}
			}
		System.out.println("遊戲結束");
	}
	private void gamming() throws InterruptedException {
		Scanner sc = new Scanner(System.in);		
		String enter =sc.nextLine();
		if (enter.equals("")) {
			condition = firstGameCycle();
			while (gameContinue) {
				nextCycle();					
			}			
		}		
	}
	
	private int firstGameCycle() throws InterruptedException {
		Random r = new Random();
		System.out.println("第"+ cycle +"局");
		cycle ++;
		int dice_1 = r.nextInt(5) +1;
		
		System.out.print("第一顆骰子點數為 ");
		Thread.sleep(1000);
		System.out.println(dice_1);
		
		Thread.sleep(1000);
		int dice_2 = r.nextInt(5) +1;
		Thread.sleep(1000);
		System.out.print("第二顆骰子點數為 ");
		Thread.sleep(1000);
		System.out.println(dice_2);
		Thread.sleep(1000);
		
		int result = dice_1 + dice_2;
		
		switch (result) {
		case 7:
			System.out.println("點數總和為 "+ result);
			System.out.println("You Win");
			gameContinue = false;
			break;
		case 11:
			System.out.println("點數總和為 "+ result);
			System.out.println("You Win");
			gameContinue = false;
			break;
		case 2:
			System.out.println("點數總和為 "+ result);
			System.out.println("You Lose");
			gameContinue = false;
			break;
		case 3:
			System.out.println("點數總和為 "+ result);
			System.out.println("You Lose");
			gameContinue = false;
			break;
		case 12:
			System.out.println("點數總和為 "+ result);
			System.out.println("You Lose");
			gameContinue = false;
			break;
		default:
			System.out.println("從第二局起的獲勝條件為點數總和= "+ result);
			break;
			}
		return result;
	}
	
	private void nextCycle() throws InterruptedException {
		Random r = new Random();
		Thread.sleep(1000);
		System.out.println("第"+ cycle +"局");
		cycle ++;
		int dice_1 = r.nextInt(5) +1;
		
		System.out.print("第一顆骰子點數為 ");
		Thread.sleep(1000);
		System.out.println(dice_1);
		
		Thread.sleep(1000);
		int dice_2 = r.nextInt(5) +1;
		Thread.sleep(1000);
		System.out.print("第二顆骰子點數為 ");
		Thread.sleep(1000);
		System.out.println(dice_2);
		Thread.sleep(1000);
		
		int result = dice_1 + dice_2;
		
		if(result ==7) {
			System.out.println("點數總和為 "+ result);
			System.out.println("You Lose");
			gameContinue = false;
		}else if (result == condition) {
			System.out.println("點數總和為 "+ result);
			System.out.println("You Win");
			gameContinue = false;
		}
	}	
}

public class _09_DiceGame {
	public static void main(String[] args) throws InterruptedException {
		Game game = new Game();
		game.start();		
	}
}
