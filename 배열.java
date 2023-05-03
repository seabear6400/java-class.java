package abc;

import java.util.Scanner;

public class Aaa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기는 ?");
		int 배열크기 = sc.nextInt();	
		
		int[] 영원 = new int[배열크기];
		
		for(int i=0; i<영원.length;i++) {
			
			System.out.println("입력하시오");
			영원[i] = sc.nextInt();
		}
		
		System.out.println("정렬 전: ");
		for(int i=0;i<영원.length; i++) {
			System.out.println(""+영원[i]);
			
		}
		
		System.out.println();
		int min;
		int temp;
		
		for(int i=0; i<영원.length; i++) {
			
			min = i;
			for(int j=i+1; j<영원.length ; j++)
				
			if(영원[min]>영원[j]) {
				
				min=j;  
				
			}
			
			temp=영원[i];
			영원[i]=영원[min];
			영원[min] = temp;
			
			System.out.println("정렬 후:");
			
			for(int k=0;k<영원.length; k++) {
				
				System.out.println(" "+영원[k]);
				
			}
			System.out.println();
		}


	}

}
