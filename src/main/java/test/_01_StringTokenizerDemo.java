package test;

import java.util.StringTokenizer;

public class _01_StringTokenizerDemo {
	public static void main(String[] args) {
		
		System.out.println("------------練習1-----------");
		String s1 = "I, love, rabbit, it, a, vary, fluffy! and cute! animal!";
		
		StringTokenizer t= new StringTokenizer(s1,",");
		String s2= "";	//將s2初始化，否則while loop內的s2無法存在
		System.out.printf("以「,」為分隔符號，s1總共被切出 %d 個tokens\n",t.countTokens());
		
		while (t.hasMoreTokens()) {	//也可以用t.hasMoreElements()
//			s2 += t.nextElement();	//這時便可利用迴圈連加，把String片段串起來
									//若用+= 可以替換成nextElement()，但若用concat()就只能用nextToken()
			s2 = s2.concat(t.nextToken());	//用concat連接字串片段，可以提高程式運行效率
		}		
		System.out.println(s2);
		System.out.println("------------練習2-----------");
		
		StringTokenizer tt= new StringTokenizer(s1,",");
		String s3="";
		
			s3 = tt.nextToken();
			s3 = s3.concat(tt.nextToken());
			s3 = s3.concat(tt.nextToken());
			s3 = s3.concat(tt.nextToken());
			s3 = s3.concat(tt.nextToken());
			s3 = s3.concat(tt.nextToken());
//			s3 = s3.concat(tt.nextToken());
			s3 = s3.concat(tt.nextToken("!"));
			s3 = s3.concat(tt.nextToken("!"));
			s3 = s3.concat(tt.nextToken("!"));
		System.out.println(s3);
		System.out.println("測試");
	}
	/*
	 * ※※StringTokenizer 類別	→ 用以去除字串中指定的字符
	 * 	※用法: 宣告StringTokenizer t = new StringTokenizer(String 內容, *String 字符);
	 * 		→ 若未指定字符，則會預設為空格，屆時將所有片段串起時會將字串中的全部空格一併去除
	 * 	 
	 * 	※相關方法:
	 * 		1. t.countTokens()	→依循前面t宣告的字符將字串切割成片段，並【return int 片段總數】。
	 * 		2. t.hasMoreTokens()	→【return boolean】檢查是否還有下一個字串片段，
	 * 									應配合while loop使用，類似iterator的hasNext()。
	 * 		   t.hasMoreElements()	→【return boolean】用法同 hasMoreTokens()，只是將String片段視為物件，
	 * 									由於回傳型別一樣，所以可和hasMoreTokens()相互替換使用。
	 * 		3. t.nextToken()	→【return String】如同iterator走訪器的next()，但缺點也跟iterator一樣，
	 * 								一經宣告就會往下走了，若要從頭算起，必須重新生成新的StringTokenizer。
	 * 		   t.nextToken(*String 新字符)	→此方法允許使用新字符，和StringTokenizer宣告時不一樣也沒問題。
	 * 										但若是想用這個方法中途變換字符，會出現練習2字符無法完全去除的狀況，且容易產生Exception，
	 * 										所以別亂用。
	 * 		   t.nextElement()	→【return nextToken()物件】雖然回傳的 "值" 與nextToken()一樣，但是要注意!!
	 * 							二者包覆值的data type不一樣，所以在 += 的狀況下與nextToken()作用相同，
	 * 							但使用concat()的狀況下，它的引數只相容String，因此限定只能搭配nextToken()
	 * 	
	 * 	※備註:本類別中的Element方法是為了讓Enumeration類別可以調用所以才存在的，若只是String相關的應用，使用token即可
	 * */
}
