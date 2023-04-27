package asdhf;

import java.util.Scanner;

import javax.swing.SwingConstants;

public class AFadfas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자1를 입력하세요.");
		int 숫자1=sc.nextInt();
		
		System.out.print("숫자2를 입력하세요.");
		int 숫자2=sc.nextInt();
		
		System.out.println("+, -, *, /");
		
		String 연산자=sc.next();
		
		switch(연산자) {
			
			case "+" :
				System.out.println(숫자1 + 숫자2);
				break;
			case "-" :
				System.out.println(숫자1 - 숫자2);
				break;
			case "*" :
				System.out.println(숫자1 * 숫자2);
				break;
			case "/" :
				System.out.println(숫자1 / 숫자2);
				break;
			default:
				System.out.println("+,-,*,/ 하나만 입력해야쥐");
		} 
		
		

	}

}
