package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
/*
 * Step1: 讓User輸入年份
 * Step2: 以此年份為基準，輸入欲查詢幾年內的黑色星期五
 * Step3: 輸出格式為 年份/月份/日期 星期
 * 
 * 提示: 請以SimpleDateFormat、Calendar完成
 * */
public class _10_BlackFriday {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入開始年份: ");
		int startYear = sc.nextInt();
		System.out.print("以輸入之年份為基準，請問要查詢幾年內的黑色星期五？");
		Scanner sc2 = new Scanner(System.in);
		int target = sc.nextInt();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd E");	//輸出格式
		
		Calendar start = Calendar.getInstance();	//Calendar 實體化
		start.set(startYear, Calendar.JANUARY, 1);	//設定日期				
		
		Calendar end = Calendar.getInstance();
		end.set(startYear + target, Calendar.JANUARY, 1);		
		
		while(start.before(end)) {
			if(start.get(Calendar.DAY_OF_WEEK) == 6 && start.get(Calendar.DATE) ==13) {
				System.out.println(df.format(start.getTime()));
			}
			start.add(Calendar.DATE, 1);
		}
	}
}
