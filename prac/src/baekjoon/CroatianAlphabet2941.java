package baekjoon;

import java.util.Scanner;

public class CroatianAlphabet2941 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int cnt = 0;
		for (int i = 0; i < input.length(); i++) {
			cnt++;
			//-, =
			if ( input.charAt(i) == '=' || input.charAt(i) == '-' )  {
				cnt--;
			}
			//lj, nj
			if ( i > 0 && input.charAt(i) == 'j') {
				if (input.charAt(i-1) == 'l' || input.charAt(i-1) == 'n') {
					cnt--;
				}
			}
			//dz=
			if ( i >= 2 && input.charAt(i) == '=') {
				if (input.charAt(i-1) == 'z' && input.charAt(i-2) == 'd' ) {
					cnt--;
				}
			}
			
		}
		
		System.out.println(cnt);
	}
}
