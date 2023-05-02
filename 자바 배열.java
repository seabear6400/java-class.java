import java.util.Scanner;

public class Ehsdv {

	public static void main(String[] args) {
		
//		int[] 배열 = new int[100];
//		int 배열2[] = new int[100];
//		System.out.println(배열[18]);
		
		int[] 배열 = new int[5];
		int dut = 0;
		Scanner sc = new Scanner(System.in);
		
		while(dut<5) {
			
			System.out.println("값을 입력하시오!");
			
			배열[dut] = sc.nextInt();
			dut++;
		}
		for(int 영원= 0;영원<5;영원++) {
		
		System.out.println(배열[영원]);
		}
	}

}
