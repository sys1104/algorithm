package baekjoon;

import java.util.Scanner;

public class StringRepeat2675 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		String[] answer = new String[T];
		StringBuffer sb = new StringBuffer();
		for ( int i = 0; i < T; i++) {
			sb.delete(0, sb.length());
			int R = scan.nextInt();
			String S = scan.next();
			
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					sb.append(String.valueOf(S.charAt(j)));
				}
				
			}
			answer[i] = sb.toString();
		}
		for ( String s : answer ) {
			System.out.println(s);
		}
	}
}