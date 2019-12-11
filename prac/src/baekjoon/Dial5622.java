package baekjoon;

import java.util.Scanner;

public class Dial5622 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(getTime(input));
	}
	
	public static int getTime(String input) {
		int time = 0;
		for ( int i = 0; i < input.length(); i++) {
			time += (charToNum(input.charAt(i)) + 1);
		}
		return time;
	}
	
	public static int charToNum(char c) {
		int number = -1;
		switch(c) {
			case 'A' : case 'B' : case 'C' : number = 2; break;
			case 'D' : case 'E' : case 'F' : number = 3; break;
			case 'G' : case 'H' : case 'I' : number = 4; break;
			case 'J' : case 'K' : case 'L' : number = 5; break;
			case 'M' : case 'N' : case 'O' : number = 6; break;
			case 'P' : case 'Q' : case 'R' : case 'S' : number = 7; break;
			case 'T' : case 'U' : case 'V' : number = 8; break;
			case 'W' : case 'X' : case 'Y' : case 'Z' : number = 9; break;
		}
		return number;
	}
}