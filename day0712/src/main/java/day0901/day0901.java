package day0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class day0901 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int[] triangle = new int[3];
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int i=0;i<3; i++) {
			 triangle[i] = Integer.parseInt(st.nextToken());
			}
			
		
			Arrays.sort(triangle);
			
			if(triangle[0]==0 && triangle[1]==0 && triangle[2]==0)
				break;
			
			
			if((triangle[0] * triangle[0]) + (triangle[1] * triangle[1])
					== (triangle[2] * triangle[2])) {
				sb.append("right").append('\n');
			}
			else {
				sb.append("wrong").append('\n');
			}
			
		}
		System.out.println(sb);
	}
}
