//加减运算
package com;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import org.junit.Test;
public class Addsub implements Calculation {
	public int getMark() {
		addsubCal();
		return 0;
	}
	@Test
	public void addsubCal(){
		Scanner reader = new Scanner(System.in);
		System.out.println("请选择操作数是否含有负数\n（1）是请输入1；\n（2）否请输入2。");
		int negative = reader.nextInt();
		switch(negative){
			case 1://操作数含有负数
				for (int i=0;i<5&&i>=0;i++){//循环输出5道随机题	
					int x = (int)(-100+Math.random()*(2*100+1));//随机产生范围内随机数和操作符
					String[] sign = { "+", "-"};
					int index = (int) (Math.random () * 2 );
					int y = (int)(-100+Math.random()*(2*100+1));
					int[] strx = new int[5];//定义数组(用于剔除重复算式2+3=和 2+3=是重复算式2+3=和3+2=不属于重复)
					String[]strs = new String[5];
					int[]stry = new int[5];
					strx[i]=x;//存入算式值
					strs[i]=sign[index];
					stry[i]=y;
					int judge = 0;//定义判断参数
					for(int j=i;j>0&&j<5;j--){//判断重复 从当前位置向前遍历数组元素		
						if(strx[i]==strx[j-1]){//比较操作数x是否重复
							if(strs[i]==strs[j-1]){//如重复比较操作符是否重复
								if(stry[i]==stry[j-1]){//如重复比较最后一个操作数是否重复
									judge=1;
								}
							}
						}
					}		
					if(judge==1){//重复 重新计算
						i=i-1;
					}else{//给出正确答案
						int z;//存储答案
						if(index==0){
							z = x+y;
						}else{
							z = x-y;
						}
						Path debugFile = Paths.get("d:\\result.txt");//输出随机式 生成的运算题存储到外部文件result.txt中
						try (OutputStream outputStream = Files.newOutputStream(debugFile, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
						PrintStream printStream = new PrintStream(outputStream, true)){
							System.setOut(printStream);
							System.out.println (x+sign[index]+"("+y+")"+"="+z);
						}catch (IOException e){
							e.printStackTrace();
						}
					}
				}
				break;
			case 2://操作数不含负数				
				System.out.println("请输入操作数的范围：\n（1）100以内请输入100；\n（2）1000以内请输入1000。");
				int Range = reader.nextInt();
				if(Range==100||Range==1000){
					System.out.println("请输入题的数量");
					if(reader.hasNextLong()){
						long amount = reader.nextLong();
						for (long i=0;i<amount;i++){//循环输出amount道随机题
							int a = (int)(0+Math.random()*(Range-0+1));//随机产生范围内随机数和操作符
							String[] sign = { "+", "-"};
							int index = (int) ( Math.random () * 2 );
							int b = (int)(0+Math.random()*(Range-0+1));
							int c;//存储正确答案
							if(index==0){
								c = a+b;
							}else{
								c = a-b;
							}
							if(c<=100&&c>=0){//运算结果控制在在0-100以内						
								System.out.println (a+sign[index]+b+"=");//输出随机式						
								System.out.println("如需留出运算行请输入1");//控制打印方式
								int row = reader.nextInt();
								if(row==1){
									System.out.println("\n\n");
								}else{
									System.out.println("输入错误！默认不留行");
								}			
								System.out.println("如需显示答案请输入1");//控制查看正确答案
								int answer = reader.nextInt();
								if(answer==1){
									System.out.println(c);
								}
								else{
									System.out.println("输入错误！默认不显示");
								}
							}else{//不在需求内 重新计算						
								i=i-1;
							}
						}
						break;	
					}else{
						System.out.println("输入错误！退出。");
						break;
					}
				}else{
					System.out.println("输入错误！退出。");
					break;	
				}
			default:
				System.out.println("输入错误！退出。");
				break;
		}
	}
}
