Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("-------------------");
			System.out.println("계산기 프로그램 입니다. ");
			System.out.println("1. 계산기 실행(1), 2.종료(2)");
			
			int 선택지 =sc.nextInt();
			System.out.println("-------------------");
			
			if(선택지==1) {
				
				System.out.println("게산기를 실행합니다.");
				System.out.println("**********************");
				System.out.println("계산할 숫자를 입력하세요.");
				int b = sc.nextInt();
				System.out.println("계산할 숫자를 입력하세요.");
				int d = sc.nextInt();
				System.out.println("**********************");
				System.out.print("(+, -, *, /) 중 연산자를 선택해 주세요 : ");
				String op =  sc.next();
				switch (op) {
				
				case "+":
					System.out.println("연산 : "+b+" + "+d+" = "+(b+d));
					break;
					
				case "-":
					System.out.println("연산 : "+b+" - "+d+" = "+(b-d));
					break;
					
				case "*":
					System.out.println("연산 : "+b+" * "+d+" = "+(b*d));
					break;
					
				case "/":
					System.out.println("연산 : "+b+" / "+d+" = "+(b/d));
					break;

				default:
					System.out.println("꺼저");
					break;
				}
				
				
			}else if(선택지==2){
				
				System.out.println("계산기를 실행 하지 않습니다. ");
				break;
				
			}else;
			
			System.out.println("안돼 돌아가");		
