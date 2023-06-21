import java.util.Scanner;

public class Aljkzxc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("num1?");
        num1 = sc.nextInt();
        System.out.print("num2?");
        num2 = sc.nextInt();
       
        // 사칙연산을 선택하게끔
        System.out.print("+(1) -(2) *(3) /(4)");
        int op = sc.nextInt();        
        double result = 0;
       
        // 계산 결과를 출력
        switch(op) {
        case 1:
        	result=add(num1, num2);
            break;
        case 2:
            result =min(num1, num2);
            break;
        case 3:
            result = div(num1, num2);
            break;
        case 4:
            // 더블 = 인트/인트
            result = mul(num1, num2);
            break;
        default:
            System.out.print("응 다시해~");        
        }
        System.out.println("결과: "+result);
    }
    // add(num1, num2)
   
    static int add(int 숫자1, int 숫자2) {
    	int 결과 = 숫자1+숫자2;
        return 결과;
	}
    static int min(int 숫자1, int 숫자2) {
    	int 결과 = 숫자1-숫자2;
        return 결과;
	}
    static int div(int 숫자1, int 숫자2) {
    	int 결과 = 숫자1/숫자2;
        return 결과;
	}
    static int mul(int 숫자1, int 숫자2) {
    	int 결과 = 숫자1*숫자2;
        return 결과;
	}
}
