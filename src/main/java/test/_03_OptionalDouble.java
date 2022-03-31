package test;

public class _03_OptionalDouble {	
/*
 * 1. 在以串流進行統計運算時，偶爾會因為filter條件設定不恰當或條件太嚴格...等原因，使得進行計算過後得到一個不存在資料的串流，
 * 		使得最終進行資料處理時產生 NoSuchElementException。
 * 
 * 2. 為了避免例外產生，便可以先將處理後的資料裝進OptionalDouble資料類別裡，之後可以搭配isPresent() 或 isEmpty()
 * 		去驗證其是否存在，確認存在後再以 getAsDouble() 取得資料值。
 * 
 * 3. 相關的API:
 * 		Optional →		內容為String時使用
 * 		OptionalInt →	內容為int時使用
 * 		OptionalLong →	內容為long時使用
 * 
 * 4. 實際應用可參考 JavaOCP20220315.day05_oo_combination_stream._07_BeefStore
 * 
 * */
}
