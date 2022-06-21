package test;

public class Te {
	public static void main(String[] args) {
		String y = String.valueOf(12321);
		StringBuilder sb = new StringBuilder(String.valueOf(12321)).reverse();
		System.out.println(sb);
		System.out.println(y);
		System.out.println(sb.equals(y));
	}
}
