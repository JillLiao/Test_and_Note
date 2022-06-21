package leetcode;

public class _001_PalindromeNumber {
	public boolean isPalindrome(int x) {
		String y = String.valueOf(x);
		String sb = new StringBuilder(y).reverse().toString();
		return sb.equals(y) ? true : false;
	}
	public static void main(String[] args) {
		System.out.println(new _001_PalindromeNumber().isPalindrome(123));
		System.out.println(new _001_PalindromeNumber().isPalindrome(12321));
	}
}
