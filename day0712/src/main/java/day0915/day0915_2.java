package day0915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day0915_2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			if(X==0&&Y==0) {
				break;
			}
			if(Y%X==0) {
				sb.append("factor").append('\n');
			}
			else if(X%Y==0) {
				sb.append("multiple").append('\n');
			}
			else {
				sb.append("neither").append('\n');
			}
		}
		System.out.println(sb);
	}
}
