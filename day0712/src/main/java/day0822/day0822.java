package day0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class day0822 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		Set<Integer> arrA = new HashSet<>();
		Set<Integer> arrB = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<A; i++) {
			arrA.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<B; i++) {
			arrB.add(Integer.parseInt(st.nextToken()));
		}
		
		int cnt = 0;
		for(int num: arrA) {
			if(!arrB.contains(num)) {
				cnt++;
			}
		}
		for(int num: arrB) {
			if(!arrA.contains(num)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
