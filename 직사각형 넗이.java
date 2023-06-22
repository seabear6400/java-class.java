package ksw;

import java.util.Scanner;

public class Gasjasdf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로를 입력하시오");
		int 가로 = sc.nextInt();
		
		System.out.println("세로를 입력하시오");
		int 세로 = sc.nextInt();
		
		int 넓이 = 넓이계산(가로, 세로);
		
		System.out.println(가로+" 가로"+세로+" 세로 : 넓이 "+넓이);
		
	    }
	
	static int 넓이계산(int num1, int num2){
		int 결과 = num1 * num2;
		return 결과;
	}

}
