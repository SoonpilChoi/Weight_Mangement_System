import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		int x = 0;
		while (x != 7) {
			Scanner in = new Scanner(System.in);
			
			System.out.println("1.오늘 몸무게");
			System.out.println("2.아침식사");
			System.out.println("3.점심식사");
			System.out.println("4.저녁식사");
			System.out.println("5.간식이나 야식");
			System.out.println("6.운동량");
			System.out.println("7.종료");
			
			System.out.println("\n원하는 메뉴를 정하시오:");		
			x = in.nextInt();
				
			
			if (x == 1) {
				System.out.println("오늘의 몸무게를 입력하시오");
				double t_w = in.nextDouble();
				System.out.println("몸무게:" + t_w);
				continue;
			}
			
			if(x == 2) {
				System.out.println("오늘의 아침식사를 입력하시오");
			 	String t_m = in.next();
			 	System.out.println("아침식사:" + t_m);
			 	continue;
			}
			
			if(x == 3) {
			 	System.out.println("오늘의 점심식사를 입력하시오");
			 	String t_l = in.next();
			 	System.out.println("점심식사:" + t_l);
			 	continue;
			}
			
			if(x == 4) {
			 	System.out.println("오늘의 저녁식사를 입력하시오");
			 	String t_d = in.next();
				System.out.println("저녁식사:" + t_d);		
				continue;
			}
			
			if(x == 5) {
				System.out.println("오늘의 아침식사를 입력하시오");
				String t_k = in.next();
				System.out.println("아침식사:" + t_k);	
				continue;
			}
			
			if(x == 6) {
				System.out.println("오늘의 운동량을 입력하시오");
				String t_e = in.next();
				System.out.println("운동량" + t_e);		
				continue;
			}
			
			if(x==7) {
				System.out.println("종료합니다.");
				break;
			}	
			 
			}
		}
	
	}

