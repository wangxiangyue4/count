//�˳�����
package com;
import java.util.Scanner;
import org.junit.Test;
public class Muldiv implements Calculation {
	public int getMark() {
		muldivCal();
		return 0;
	}
	@Test
	public void muldivCal(){
		Scanner reader = new Scanner(System.in);
		int amount =10;//amount�洢�������Ϊ10
		System.out.println("��ѡ��������Ƿ��и���\n��1����������1��\n��2����������2��");
		int negative = reader.nextInt();
		switch (negative) {
		case 1://���������и���			
			for (int i=0;i<amount;i++){
				int a =  (int)(-100+Math.random()*(200));//���������
				int b= (int)(-100+Math.random()*(200));;
				int c;	
				String[] sign = { "*", "/"};
				int index = (int) ( Math.random () * 2 );				
				if(index == 0){//������ȷ��
					c = a*b;
				}else{
					c = a/b;
				}
				System.out.println (a+sign[index]+b+"="+c);
			}
			break;
		case 2://�����������и���	
			System.out.println("��ѡ��������Ƿ��з���\n��1����������1��\n��2����������2��");
			int fraction = reader.nextInt();
			switch (fraction) {
			case 1://���з���
				for (int i=0;i<amount;i++){
					double x = (double)(0+Math.random()*(100-0+1));					
					String[] sign_1 = { "*", "/"};
					int index_1 = (int) ( Math.random () * 2 );					
					double y = (double)(0+Math.random()*(100-0+1));
					double z;					
					if(index_1==0){//������ȷ��
						z = x*y;
					}else{
						z = x/y;
					}
					System.out.println (x+sign_1[index_1]+y+"="+z);
				}
				break;
			case 2:
				for (int i=0;i<amount;i++){					
					int o = (int)(0+Math.random()*(100-0+1));//���������
					String[] sign_2 = { "*", "/"};
					int index_2 = (int) ( Math.random () * 2 );
					int p = (int)(0+Math.random()*(100-0+1));
					int q;					
					if(index_2==0){//������ȷ��
						q = o*p;
					}else{
						q = o/p;
					}
					System.out.println (o+sign_2[index_2]+p+"="+q);
				}
				break;
			default:
				System.out.println("��������˳���");
				break;
			}
			break;
		default:
			System.out.println("��������˳���");
			break;
		}
	}
}
