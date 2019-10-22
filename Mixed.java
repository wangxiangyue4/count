//加减混合运算
package com;
import java.util.Scanner;
import org.junit.Test;
public class Mixed implements Calculation {
	public int getMark() {
		mixedCal();
		return 0;
	}
	@Test
	public void mixedCal(){
		int amount =10;//amount存储题的数量为10
		Scanner reader = new Scanner(System.in);
		System.out.println("请选择操作数是否含有小括号：\n（1）是请输入1；\n（2）否请输入2。");
		int brackets = reader.nextInt();
		switch (brackets) {
		case 1://含有小括号
			for (int i=0;i<amount;i++){//循环输出amount道随机题
				int style = (int) ( Math.random () * 2 );
				switch(style){
					case 0://1.(a+b)+c
						int a = (int)(0+Math.random()*(100-0+1));//随机产生范围内随机数和操作符
						String[] sign = { "+", "-"};
						int index1 = (int) ( Math.random () * 2 );
						int b = (int)(0+Math.random()*(100-0+1));
						int index2 = (int) ( Math.random () * 2 );
						int c = (int)(0+Math.random()*(100-0+1));
						int d1,d2;//定义结果参数
						if(index1==0){//计算正确答案
							d1 = a+b;
						}else{
							d1 = a-b;
						}
						if(index2==0){
							d2 = d1+c;
						}else{
							d2 = d1-c;
						}
						System.out.println ("("+a+sign[index1]+b+")"+sign[index2]+c+"="+d2);	
						break;
					case 1://2.a+(b+c)
						int x = (int)(0+Math.random()*(100-0+1));//随机产生范围内随机数和操作符
						String[] sign_1 = { "+", "-"};
						int index_1 = (int) ( Math.random () * 2 );
						int y = (int)(0+Math.random()*(100-0+1));
						int index_2 = (int) ( Math.random () * 2 );
						int z = (int)(0+Math.random()*(100-0+1));								
						int d_1=0,d_2=0;//定义结果参数
						if(index_2==0){//计算正确答案
							d_2 = y+z;
						}else{
							d_2= y-z;
						}
						if(index_1==0){
							d_1 = x+d_2;
						}else{
							d_1 = x-d_2;
						}
						System.out.println (x+sign_1[index_1]+"("+y+sign_1[index_2]+z+")"+"="+d_1);
						break;
					}
				}
			break;
		case 2:
			for (int i=0;i<amount;i++){	
				int d = (int)(0+Math.random()*(100-0+1));//随机产生范围内随机数和操作符
				String[] sign_2 = { "+", "-"};
				int index2_1 = (int) ( Math.random () * 2 );
				int e = (int)(0+Math.random()*(100-0+1));
				int index2_2 = (int) ( Math.random () * 2 );
				int f = (int)(0+Math.random()*(100-0+1));;
				int g1,g2;//定义结果参数
				if(index2_1==0){//计算正确答案
					g1 = d+e;
				}else{
					g1 = d-e;
				}
				if(index2_2==0){
					g2 = g1+f;
				}else{
					g2 = g1-f;
				}
				System.out.println (d+sign_2[index2_1]+e+sign_2[index2_2]+f+"="+g2);//输出随机式
			}
			break;	
		default:
			System.out.println("输入错误！退出。");
			break;
		}
	}
}
