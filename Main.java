/**
 * �Զ���������������
 */
package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner reader = new Scanner(System.in);
			System.out.println("ѡ�������㣺\n��1������Ӽ�����������1��\n��2������Ӽ��������������2��\n��3������˳�����������3��");
			int type = reader.nextInt();
			Factory factory = new Factory();
			factory.getCalculation(type);	
	}
}
