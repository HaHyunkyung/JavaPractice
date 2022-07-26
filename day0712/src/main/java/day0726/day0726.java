package day0726;

import java.util.Scanner;

public class day0726 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int max = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = search(arr, num, max);
		System.out.println(result);
	}
	
	static int search(int[] arr, int num, int max) {
		int result=0;
		
		for(int i=0;i<num-2;i++) {
			for(int j=i+1;j<num-1;j++) {
				for(int k=j+1; k<num;k++) {
					int temp = arr[i] + arr[j] + arr[k];
					
					if(max == temp) {
						return temp;
					}
					
					if(result < temp&&temp<max) {
						result = temp;
					}
				}
			}
		}
		
		return result;
	}
}
