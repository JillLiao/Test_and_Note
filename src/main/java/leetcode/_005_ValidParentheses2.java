package leetcode;

import java.util.Stack;

public class _005_ValidParentheses2 {
	public boolean isValid(String s) {        
		
		boolean answer = false;
		
		if(s.length()%2 !=0) {
			return false;
		}
		
		Stack<Character> charPara = new Stack<>();
		char[] charArray = s.toCharArray();
		
		for(int i=0,lens=charArray.length;i<lens;i++) {
			switch (charArray[i]) {
			case '(':
				charPara.push(charArray[i]);
				break;
			case '[':
				charPara.push(charArray[i]);
				break;
			case '{':
				charPara.push(charArray[i]);
				break;
			case ')':
				if(charPara.pop()!='(') {
					answer= false;
				}
				break;
			case ']':
				if(charPara.pop()!='[') {
					answer= false;
				}
				break;
			case '}':
				if(charPara.pop()!='{') {
					answer= false;
				}
				break;
			}
		}
			
//		for(int i=0, lens=s.length();i<lens;i+=2) {
//			switch (s.charAt(i)) {
//				case '(':
//					if(s.charAt(i+1) != ')') {
//						answer= false;
//					}
//					break;
//				case '[':
//					if(s.charAt(i+1) != ']') {
//						answer= false;
//					}
//					break;
//				case '{':
//					if(s.charAt(i+1) != '}') {
//						answer= false;
//					}
//					break;
//				default:
//					answer = false;
//					break;
//			}
//		}		
		return answer;
    }
	
	public static void main(String[] args) {
		_005_ValidParentheses2 test = new _005_ValidParentheses2();
		System.out.println(test.isValid("(){}"));
		
//		String s ="(([]){})";
//		Stack<Character> charPara = new Stack<>();
//		char[] charArray = s.toCharArray();
//		for(int i=0,lens=charArray.length;i<lens;i++) {
//			switch (charArray[i]) {
//			case '(':
//				charPara.push(charArray[i]);
//				break;
//			case '[':
//				charPara.push(charArray[i]);
//				break;
//			case '{':
//				charPara.push(charArray[i]);
//				break;
//			case ')':
//				if(charPara.pop()!='(') {
//					System.out.println(") false");
//				}
//				break;
//			case ']':
//				if(charPara.pop()!='[') {
//					System.out.println("] false");
//				}
//				break;
//			case '}':
//				if(charPara.pop()!='{') {
//					System.out.println("} false");
//				}
//				break;
//			}
//		}
//		System.out.println(charPara);
		
		
		
		
		
	}
}
