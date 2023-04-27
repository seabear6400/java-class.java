package gyushfgj;

import java.util.Scanner;

public class Sadfasd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("몇단 까지 해줄까?");
		int a=sc.nextInt();
		
		System.out.println("몇까지 곱할거야?");
		int b=sc.nextInt();
		for(int j=2;j<=a;j++) {
			
			for(int i=1; i<=b;i++) {
				System.out.println(j+"*"+i+"="+(j*i));
		}
			
		}
		

	}

}
