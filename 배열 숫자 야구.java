import java.util.Random;
import java.util.Scanner;

public class Gafjd {

	public static void main(String[] args) {

		        // 컴터가 숫자 3개를 결정
		        Random rd = new Random();
		               
		        int[] 정연택 = new int[3];
		        
//		        int 정 = rd.nextInt(9)+1;
//		        int 연 = rd.nextInt(9)+1;
//		        int 택 = rd.nextInt(9)+1;
		       
		        
		        for(int i=0;i<정연택.length; i++) {
		        	정연택[i] = rd.nextInt(9)+1;
		        }
		       
//		        while(정==연||연==택||택==정) {
//		            정 = rd.nextInt(9)+1;
//		            연 = rd.nextInt(9)+1;
//		            택 = rd.nextInt(9)+1;
//		        }
			        while(정연택[0]==정연택[1] 
		        		|| 정연택[0]==정연택[2] 
		        		 ||정연택[1]==정연택[2]) {
		        	for(int i=0;i<정연택.length; i++) {
			        	정연택[i] = rd.nextInt(9)+1;
			        }
		        }
		        Scanner sc = new Scanner(System.in);
		        // 사용자가 숫자 3개를 입력
		        int s = 0;
		        int b = 0;
		        //  int jyt;
		        int[] jyt = new int[3];
		        int num;
		        
		        while(s!=3) {
		        	System.out.print("숫자 3개 입력해봐");
		        	num = sc.nextInt();
		        	s=0;
		        	b=0;
		        	if(num>999) {
		        		System.out.println("다시해");
		        	} else {
		        		for(int i=jyt.length-1;i>=0;i--) {
		        			jyt[i] = num%10;
		        			// [3]
		        			num = num / 10;	        			

		        		}
		        		
		        		if(정연택[0]==jyt[0]) s++;
		        		if(정연택[1]==jyt[1]) s++;
		        		if(정연택[2]==jyt[2]) s++;
		        		
		        		if(jyt[0]==정연택[1] || jyt[0]==정연택[2]) b++;
		        		if(jyt[1]==정연택[0] || jyt[1]==정연택[2]) b++;
		        		if(jyt[2]==정연택[0] || jyt[2]==정연택[1]) b++;
		        		
		        		System.out.println(s+"스트라이크"+b+"볼");
		        		if(s==3) System.out.println("축하해");
		        	}
		    }
		}
}
