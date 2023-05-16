import java.util.Scanner;

public class Gsssw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		for(int i=1; i<=20;i++) {
			if(i%3==0) {
				sum+=i;
				System.out.println("sum:"+sum);
			
			}
		}
		System.out.println("최종 sum:"+sum);
	}

}
