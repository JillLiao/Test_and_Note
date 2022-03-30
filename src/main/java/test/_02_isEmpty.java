package test;

public class _02_isEmpty {

	public static void main(String[] args) {
		String str1 = "";
		String str2= null;
//		System.out.printf("str1.length()= %d, str2.length()= %d, str1.isEmpty()= %b, str2.isEmpty()= %d\n"
//				,str1.length(), str2.length(), str1.isEmpty(), str2.isEmpty());
		System.out.println(str1.length() == 0 );
		System.out.println(str1.isEmpty());
	}
/*
 * 1. null為值而非物件，在heap區不佔有任何的記憶體空間，意味著被宣告為null的字串並沒有物件的實體，
 * 		因此無法調用任何的方法，否則會出現NullPointerException
 * 2. 雖然String初始化預設值為null，但在 String str = new String() 的狀況下，預設值為空字串 ""
 * 3. 要測試String內容是否為null，只能透過  if(str == null) 來判斷
 * 4. 若要測試String內容是否為空字串 ""，則可以透過 if(str.length()==0) 或 if(str.empty()) 或直接一點 if(str == "")
 * 
 * */
}
