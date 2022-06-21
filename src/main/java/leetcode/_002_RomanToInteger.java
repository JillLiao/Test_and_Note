package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class _002_RomanToInteger {
	public int romanToInt(String s) {		
		char[] input =	s.toCharArray();
		int lens = input.length;
		Integer[] answerArray = new Integer[lens];
		Map<Character, Integer> format = new LinkedHashMap<>();
		format.put('I',1);
		format.put('V',5);
		format.put('X',10);
		format.put('L',50);
		format.put('C',100);
		format.put('D',500);
		format.put('M',1000);
		
		for(Map.Entry<Character, Integer> entry : format.entrySet()) {
			for(int i=0;i<lens;i++) {
				if(entry.getKey().equals(input[i])) {
					answerArray[i] = entry.getValue();
				}
			}
		}
		
		int answer =0;
		for(int i=0;i<lens;i++) {
			if(i==lens-1) {
				answer += answerArray[i];
			}else if(answerArray[i]<answerArray[i+1]){
				answer -= answerArray[i];
			}else {
				answer += answerArray[i];
			}
		}
        return answer;
    }
	
	public int romanToInt_2(String s) {	//better
		char[] input =	s.toCharArray();
		int lens = input.length;
		int[] answerArray = new int[lens];		
				
		for(int i=0;i<lens;i++) {
			switch (input[i]) {
			case 'I':
				answerArray[i] = 1;
				break;
			case 'V':
				answerArray[i] = 5;
				break;
			case 'X':
				answerArray[i] = 10;
				break;
			case 'L':
				answerArray[i] = 50;
				break;
			case 'C':
				answerArray[i] = 100;
				break;
			case 'D':
				answerArray[i] = 500;
				break;
			case 'M':
				answerArray[i] = 1000;
				break;
			}			
		}
		
		int answer =0;
		for(int i=0;i<lens;i++) {
			if(i==lens-1) {
				answer += answerArray[i];
			}else if(answerArray[i]<answerArray[i+1]){
				answer -= answerArray[i];
			}else {
				answer += answerArray[i];
			}
		}
        return answer;		
	}
	
	
	public static void main(String[] args) {
		_002_RomanToInteger r = new _002_RomanToInteger();
		
		System.out.println(r.romanToInt("MCMXCIV"));

	}

}
