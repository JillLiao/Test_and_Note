package leetcode;

public class _005_ValidParentheses {
	public boolean isValid(String s) {        
		if(s.length()%2 !=0) {
			return false;
		}
		boolean answer = true;
		for(int i=0, lens=s.length();i<lens;i+=2) {
			switch (s.charAt(i)) {
				case '(':
					if(s.charAt(i+1) != ')') {
						answer= false;
					}
					break;
				case '[':
					if(s.charAt(i+1) != ']') {
						answer= false;
					}
					break;
				case '{':
					if(s.charAt(i+1) != '}') {
						answer= false;
					}
					break;
				default:
					answer = false;
					break;
			}
		}
		if(answer == false) {
			char[] ss = s.toCharArray();
			for(int i=0,lens=s.length();i<lens/2;i++) {
				switch (ss[i]) {
					case '(':
						ss[i] = ')';
						break;
					case '[':
						ss[i] = ']';
						break;
					case '{':
						ss[i] = '}';
						break;
					default:
						return false;
				}
			}
			String st= new String(ss);
			String sb = new StringBuilder(st).reverse().toString();
			return sb.equals(st) ? true : false;
		}
		return answer;
    }
	
	public static void main(String[] args) {
		_005_ValidParentheses test = new _005_ValidParentheses();
		System.out.println(test.isValid("(([]){})"));
		
		String s ="(([]){})";
		
		char[] ss = s.toCharArray();
		for(int i=0,lens=s.length();i<lens/2;i++) {
			switch (ss[i]) {
				case '(':
					ss[i] = ')';
					break;
				case '[':
					ss[i] = ']';
					break;
				case '{':
					ss[i] = '}';
					break;
			}		
		}
		System.out.println(ss);
		String st= new String(ss);
		String sb = new StringBuilder(st).reverse().toString();
		System.out.println(sb.equals(st) ? true : false);
	}
}
