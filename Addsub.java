//�Ӽ�����
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
		System.out.println("��ѡ��������Ƿ��и���\n��1����������1��\n��2����������2��");
		int negative = reader.nextInt();
		switch(negative){
			case 1://���������и���
				for (int i=0;i<5&&i>=0;i++){//ѭ�����5�������	
					int x = (int)(-100+Math.random()*(2*100+1));//���������Χ��������Ͳ�����
					String[] sign = { "+", "-"};
					int index = (int) (Math.random () * 2 );
					int y = (int)(-100+Math.random()*(2*100+1));
					int[] strx = new int[5];//��������(�����޳��ظ���ʽ2+3=�� 2+3=���ظ���ʽ2+3=��3+2=�������ظ�)
					String[]strs = new String[5];
					int[]stry = new int[5];
					strx[i]=x;//������ʽֵ
					strs[i]=sign[index];
					stry[i]=y;
					int judge = 0;//�����жϲ���
					for(int j=i;j>0&&j<5;j--){//�ж��ظ� �ӵ�ǰλ����ǰ��������Ԫ��		
						if(strx[i]==strx[j-1]){//�Ƚϲ�����x�Ƿ��ظ�
							if(strs[i]==strs[j-1]){//���ظ��Ƚϲ������Ƿ��ظ�
								if(stry[i]==stry[j-1]){//���ظ��Ƚ����һ���������Ƿ��ظ�
									judge=1;
								}
							}
						}
					}		
					if(judge==1){//�ظ� ���¼���
						i=i-1;
					}else{//������ȷ��
						int z;//�洢��
						if(index==0){
							z = x+y;
						}else{
							z = x-y;
						}
						Path debugFile = Paths.get("d:\\result.txt");//������ʽ ���ɵ�������洢���ⲿ�ļ�result.txt��
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
			case 2://��������������				
				System.out.println("������������ķ�Χ��\n��1��100����������100��\n��2��1000����������1000��");
				int Range = reader.nextInt();
				if(Range==100||Range==1000){
					System.out.println("�������������");
					if(reader.hasNextLong()){
						long amount = reader.nextLong();
						for (long i=0;i<amount;i++){//ѭ�����amount�������
							int a = (int)(0+Math.random()*(Range-0+1));//���������Χ��������Ͳ�����
							String[] sign = { "+", "-"};
							int index = (int) ( Math.random () * 2 );
							int b = (int)(0+Math.random()*(Range-0+1));
							int c;//�洢��ȷ��
							if(index==0){
								c = a+b;
							}else{
								c = a-b;
							}
							if(c<=100&&c>=0){//��������������0-100����						
								System.out.println (a+sign[index]+b+"=");//������ʽ						
								System.out.println("��������������������1");//���ƴ�ӡ��ʽ
								int row = reader.nextInt();
								if(row==1){
									System.out.println("\n\n");
								}else{
									System.out.println("�������Ĭ�ϲ�����");
								}			
								System.out.println("������ʾ��������1");//���Ʋ鿴��ȷ��
								int answer = reader.nextInt();
								if(answer==1){
									System.out.println(c);
								}
								else{
									System.out.println("�������Ĭ�ϲ���ʾ");
								}
							}else{//���������� ���¼���						
								i=i-1;
							}
						}
						break;	
					}else{
						System.out.println("��������˳���");
						break;
					}
				}else{
					System.out.println("��������˳���");
					break;	
				}
			default:
				System.out.println("��������˳���");
				break;
		}
	}
}
