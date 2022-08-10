package day0810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class day0810_2 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] arr = new String[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String c1, String c2) {
				if(c1.length() == c2.length()) {
					return c1.compareTo(c2);
				} else {
					return c1.length() - c2.length();
 				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(arr[0]).append('\n');
		
		for(int i=1;i<N;i++) {
			if(!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]).append('\n');
			}
		}
		System.out.println(sb);
		
	}
}
