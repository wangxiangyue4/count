//������
package com;

public class Factory {

	void getCalculation(int type){
		Calculation calculation;
		switch(type){
			case 1:calculation = new Addsub();calculation.getMark();break;
			case 2:calculation = new Mixed();calculation.getMark();break;
			case 3:calculation = new Muldiv();calculation.getMark();break;
			default:System.out.println("��������˳���");break;
		}
	}
}
