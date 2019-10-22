//乘除运算
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
		int amount =10;//amount存储题的数量为10
		System.out.println("请选择操作数是否含有负数\n（1）是请输入1；\n（2）否请输入2。");
		int negative = reader.nextInt();
		switch (negative) {
		case 1://操作数含有负数			
			for (int i=0;i<amount;i++){
				int a =  (int)(-100+Math.random()*(200));//产生随机数
				int b= (int)(-100+Math.random()*(200));;
				int c;	
				String[] sign = { "*", "/"};
				int index = (int) ( Math.random () * 2 );				
				if(index == 0){//计算正确答案
					c = a*b;
				}else{
					c = a/b;
				}
				System.out.println (a+sign[index]+b+"="+c);
			}
			break;
		case 2://操作数不含有负数	
			System.out.println("请选择操作数是否含有分数\n（1）是请输入1；\n（2）否请输入2。");
			int fraction = reader.nextInt();
			switch (fraction) {
			case 1://含有分数
				for (int i=0;i<amount;i++){
					double x = (double)(0+Math.random()*(100-0+1));					
					String[] sign_1 = { "*", "/"};
					int index_1 = (int) ( Math.random () * 2 );					
					double y = (double)(0+Math.random()*(100-0+1));
					double z;					
					if(index_1==0){//计算正确答案
						z = x*y;
					}else{
						z = x/y;
					}
					System.out.println (x+sign_1[index_1]+y+"="+z);
				}
				break;
			case 2:
				for (int i=0;i<amount;i++){					
					int o = (int)(0+Math.random()*(100-0+1));//产生随机数
					String[] sign_2 = { "*", "/"};
					int index_2 = (int) ( Math.random () * 2 );
					int p = (int)(0+Math.random()*(100-0+1));
					int q;					
					if(index_2==0){//计算正确答案
						q = o*p;
					}else{
						q = o/p;
					}
					System.out.println (o+sign_2[index_2]+p+"="+q);
				}
				break;
			default:
				System.out.println("输入错误！退出。");
				break;
			}
			break;
		default:
			System.out.println("输入错误！退出。");
			break;
		}
	}
}
