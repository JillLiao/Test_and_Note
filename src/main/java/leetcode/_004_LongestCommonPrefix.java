package leetcode;

/*不完整*/

public class _004_LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
        
		int lens = strs.length;
		String answer="";;
        
		for(int i=1, ln = strs[0].length();i<ln;i++) {
        	String t =strs[0].substring(0, i);
        	int count=0;
        	for(int k=0;k< lens;k++) {
        		if(strs[k].substring(0, i).equals(t)) {
        			count++;
        		}
        	}
        	if(count == lens) {
        		answer= t;
        	}else {
				break;
			}
        	count =0;
        }        
        return answer;
    }
	
	public static void main(String[] args) {
		_004_LongestCommonPrefix a = new _004_LongestCommonPrefix();
		String [] aa = {"flower", "flow123"};
//		String t =aa[0].substring(0, 1);
//		System.out.println(t);
		System.out.println(a.longestCommonPrefix(aa));
	}

}
