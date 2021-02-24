package com.vari.controller;

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//자동형 변환 작은범위의 자료형에서 큰범위 자료형으로 변경될 때

		long lnum = 100;
		double dnum = lnum;
		System.out.println(dnum);

		//+연산시에도 자료형은 같아함/
		//연산시에 자료형이 다를때는 더 큰 자료형에 맞춰서 자동형변환.
		System.out.println(10+30.5);

/*
  강제 형변환 : 큰 자료형에서 작은 자료형으로 대입할 때 error.
* 값의 범위가 자료형을 값의 범위가 작은 자료형으로 변환 강제 형변환 시
* 데이터 손실이 발생할 수 있음 -> 데이터의 변형, 손실을 감수하고
* 강제 변환
*/
	int num = 100;
	double height = 180.5;
	num = (int)height;
		System.out.println(num);  //0.5가 날라갔다.. data loss

	byte bnum = (byte)290;
	System.out.println(bnum);

	// char 문자 -> 코드 매핑되어있는 숫자를 가지고 있다.
	char ch = 'A';
	System.out.println(ch);
	System.out.println((int)ch);
	num=97;
	System.out.println(num);
	System.out.println((char)97);

	ch =(char)(ch + 1); // int값 연산 후 char로 형 변환해준다.
	System.out.println(ch);

	System.out.print("dd");
	System.out.print("dd");
	System.out.print("dd");
	System.out.println("");
	System.out.println("Dd");
	System.out.println("Dd");
	System.out.println("Dd");
	System.out.println("Dd");


	}


}
