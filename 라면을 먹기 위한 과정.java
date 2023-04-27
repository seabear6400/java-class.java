
import java.util.Scanner;

public class Afaasjf {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("라면을 끓여보자!");
		System.out.println("가스레렌인지 앞에 섰다. ");
		System.out.println("1. 불을 킨다.     2.아 걍 생라면이나 쳐 먹을래. ");
		int ㄻ=sc.nextInt();
		
		if(ㄻ==1) {
			System.out.println("어머 불이 켜졌다.");
			System.out.println("1.스프-면를 넣는다.   2. 귀찮다. 그냥 편의점 가야쥥");
			int ㄻ2=sc.nextInt();
			if(ㄻ2==1) {
				System.out.println("2분을 좀더 끓이고");
				System.out.println("김치에다 맛있게 먹는다.");
			} else if(ㄻ2==2) {
				System.out.println("편의점 가야쥥 룰루 랄라");
			} else {
				System.out.println("안돼 돌아가(1,2중에 골라)");
			}
		} else if(ㄻ==2) {
		
			System.out.println("tlqkf 생 라면 겁나 맛있네");
		
		} else {
		
			System.out.println("3번째 가는건 없어 ㅄ아 그냥 1,2중에 골라 풉ㅋ");
		
			}
		}
		

	}


