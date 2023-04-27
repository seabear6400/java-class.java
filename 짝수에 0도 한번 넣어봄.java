package qasdfs;

import java.util.Scanner;

public class ASDSDSDF {

	public static void main(String[] args) {
		System.out.println("너무 졸려");
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하시오 : ");
		int num = sc.nextInt();
		System.out.println(num);
		
		if(num==0)
			System.out.println("0는 어디에도 성립 되지 않는다.");
		else if(num%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}

}
