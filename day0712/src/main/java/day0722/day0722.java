package day0722;

import java.util.Scanner;

public class day0722 {
	static String underbar ="";
	public static void recur(int N) {
		
		String line = underbar;
		
		if(N==0) {
			System.out.println(line + "\"����Լ��� ������?\"");
			System.out.println(line + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(line + "��� �亯�Ͽ���.");
			return;
		}
		System.out.println(line + "\"����Լ��� ������?\"");
		System.out.println(line + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(line + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(line + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		
	
	underbar += "_";
	
	recur(N-1);
	
	System.out.println(line +"��� �亯�Ͽ���."); 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		recur(N);
	}
}
