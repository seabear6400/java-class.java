import java.util.Random;
import java.util.Scanner;

public class Ncvbz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int 새로=rd.nextInt(49)+1;
		int 횟수 = 0;
		System.out.println("맞춰봐");
		
		
		while(true) {
			
			int 입력 = sc.nextInt();
			횟수++;
			
			if(새로<입력) {
				
				System.out.println("더 밑에 있음");
				
			}else if(새로>입력) {
				
				System.out.println("더 위에 있음");
				
			}else if(새로==입력) {
				
				System.out.println("맞췄네 ㅋ");
				System.out.println(횟수+"번 입력하셨습니다.");
				break;
				
			}else {
				
				System.out.println("야 숫자만 입력하라고.");
				
			}
		}
	}

}
