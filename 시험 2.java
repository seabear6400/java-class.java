import java.util.Scanner;

public class Ffshda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("체중?");
		float 몸무게 = sc.nextInt();
		System.out.println("키");
		float 키 = sc.nextInt();
		
		float bmi = 몸무게/(키*키);
		
		if(bmi <18.5) {
			
			System.out.println("저체중입니다.");
			
		}else if(bmi<25) {
			
			System.out.println("건강합니다.");
			
		}else if(bmi<= 29.9) {
			
			System.out.println("과체중입니다.");
			
		}else if(bmi>30) {
			
			System.out.println("비만입니다.");
			
		}else {
			
			System.out.println("값 오류");
			
		}

	}

}
