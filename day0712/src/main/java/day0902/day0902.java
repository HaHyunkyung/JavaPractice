package day0902;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day0902 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		//가로 세로 최대 길이 저장
		int hMax = 0, wMax = 0;
		int hMaxIdx = -1, wMaxIdx = -1;
		
		int[] dirs = new int[6];
		int[] dist = new int[6];
		
		for(int i=0; i<6; i++) {
			st = new StringTokenizer(br.readLine());
			dirs[i] = Integer.parseInt(st.nextToken());
			dist[i] = Integer.parseInt(st.nextToken());
			if(dirs[i] == 1|| dirs[i] ==2 ) {
				if(hMax < dist[i]) {
					hMax = dist[i];
					hMaxIdx = i;
				}
			}
			else {
				if(wMax < dist[i]) {
					wMax = dist[i];
					wMaxIdx = i;
				}
			}
		}
		int maxSquare = wMax * hMax;
		
		int minSquare = dist[(wMaxIdx + 3)%6] * dist[(hMaxIdx + 3) % 6];
		
		System.out.println((maxSquare-minSquare)*N);
	}
}
