package day0831;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day0831 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] dot_1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine());
		int[] dot_2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine());
		int[] dot_3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		
		int x;
		int y;
		
		if(dot_1[0] == dot_2[0]) {
			x = dot_3[0];
		}
		else if(dot_1[0] == dot_3[0]) {
			x = dot_2[0];
		}
		else {
			x = dot_1[0];
		}
		
		if(dot_1[1] == dot_2[1]) {
			y = dot_3[1];
		}
		else if(dot_1[1] == dot_3[1]) {
			y = dot_2[1];
		}
		else {
			y = dot_1[1];
		}
		
		System.out.println(x + " " + y);
	}
}
