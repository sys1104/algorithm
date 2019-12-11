package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class GroupWord1316 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int scanCnt = scan.nextInt();
		String[] input = new String[scanCnt];
		int answer = 0;
		
		for (int i = 0; i < input.length; i++) {
			input[i] = scan.next();
			answer += isGroupWord(input[i]) ? 1 : 0; 
		}
		System.out.println(answer);
	}
	
	public static boolean isGroupWord(String input) {
		HashSet<Character> hs = new HashSet<>();
		boolean isGroupWord = true;
		for (int i = 0; i < input.length(); i++) {
			//연속된 문자일 경우 중복체크 생략
			if ( i > 0 && input.charAt(i-1) == input.charAt(i) ) {
				continue;
			}
			isGroupWord = hs.add(input.charAt(i));
			if (!isGroupWord) break;
		}
		return isGroupWord;
	}
	
}
