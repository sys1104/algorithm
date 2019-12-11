package baekjoon;

import java.util.Scanner;

public class NumberSum11720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String input = scan.next();
		int answer = 0;
		for ( int i = 0; i < n; i++) {
			answer += Integer.valueOf(String.valueOf(input.charAt(i)));
		}
		System.out.println(answer);
	}
}