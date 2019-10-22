/**
 * 自动生成四则运算题
 */
package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner reader = new Scanner(System.in);
			System.out.println("选择请运算：\n（1）输出加减运算请输入1；\n（2）输出加减混合运算请输入2；\n（3）输出乘除运算请输入3。");
			int type = reader.nextInt();
			Factory factory = new Factory();
			factory.getCalculation(type);	
	}
}
