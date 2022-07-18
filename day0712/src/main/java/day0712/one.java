package day0712;

import java.util.Scanner;

public class one {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer=0;
		
		if (n%5 ==0) {
			answer = n/5;
		}
		
		else {
			while(true) {
				n -= 3;
				if(n < 0) {
					answer = -1;
					break;
				}
				answer ++;
				if(n%5==0) {
					answer += n/5;
					break;
				}
			}
		}
		System.out.println(answer);
	}	
}
