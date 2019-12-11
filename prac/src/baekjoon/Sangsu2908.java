package baekjoon;

import java.util.Scanner;

public class Sangsu2908 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(sangsu(a, b));
		
	}
	public static int sangsu(int a, int b) {		
		int reverseA = Integer.parseInt(reverseString(String.valueOf(a)));
		int reverseB = Integer.parseInt(reverseString(String.valueOf(b)));
		
		return reverseA > reverseB ? reverseA : reverseB;
	}
	public static String reverseString(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = str.length()-1; i >= 0 ; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
