import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		int x = 0;
		while (x != 7) {
			Scanner in = new Scanner(System.in);
			
			System.out.println("1.���� ������");
			System.out.println("2.��ħ�Ļ�");
			System.out.println("3.���ɽĻ�");
			System.out.println("4.����Ļ�");
			System.out.println("5.�����̳� �߽�");
			System.out.println("6.���");
			System.out.println("7.����");
			
			System.out.println("\n���ϴ� �޴��� ���Ͻÿ�:");		
			x = in.nextInt();
				
			
			if (x == 1) {
				System.out.println("������ �����Ը� �Է��Ͻÿ�");
				double t_w = in.nextDouble();
				System.out.println("������:" + t_w);
				continue;
			}
			
			if(x == 2) {
				System.out.println("������ ��ħ�Ļ縦 �Է��Ͻÿ�");
			 	String t_m = in.next();
			 	System.out.println("��ħ�Ļ�:" + t_m);
			 	continue;
			}
			
			if(x == 3) {
			 	System.out.println("������ ���ɽĻ縦 �Է��Ͻÿ�");
			 	String t_l = in.next();
			 	System.out.println("���ɽĻ�:" + t_l);
			 	continue;
			}
			
			if(x == 4) {
			 	System.out.println("������ ����Ļ縦 �Է��Ͻÿ�");
			 	String t_d = in.next();
				System.out.println("����Ļ�:" + t_d);		
				continue;
			}
			
			if(x == 5) {
				System.out.println("������ ��ħ�Ļ縦 �Է��Ͻÿ�");
				String t_k = in.next();
				System.out.println("��ħ�Ļ�:" + t_k);	
				continue;
			}
			
			if(x == 6) {
				System.out.println("������ ����� �Է��Ͻÿ�");
				String t_e = in.next();
				System.out.println("���" + t_e);		
				continue;
			}
			
			if(x==7) {
				System.out.println("�����մϴ�.");
				break;
			}	
			 
			}
		}
	
	}

