package com.vari.controller;

public class VariableUse {

	public static void main(String[] args) {


		//변수선언 및 대입하기
		int age;
		age=10;
		System.out.println(age);

		//long 타입 변수 선언 및 대입하기
		long lnum =1000;

		lnum = 10000000000L;

		double dnum;
		dnum = 180.5;

		float fnum;
		fnum = 180.5f; //자료형을 맞춰야 한다.

		byte bnum;
		bnum = 100; // 작은 값들은 자동적으로 형변환을 해준다.

		short snum;
		snum = 10000;


		//문자
		char cnum;  // char는 단 한글자만 가능
		cnum = 'A';
		cnum = '가';

		//문자열
		String str;
		str = "a";
		str = "둘리";
		str = "여러분들 자바 아직까지는 안 어렵죠? 힘내세요! 아자아자";


		//  호출
		// 변수명을 코드에 작성
		System.out.println(str);
		System.out.println(dnum);

		//추가적인 변수선언

//		int grade;
//		int record;
//		int number;
//		int group;
		int grade,record,number,group;  // RAM 한 공간에 변수4개가 생긴다.

		double height=180.5,weight=65.5,avg=88.5;

		// Date today = new Date(); // 같은 패기지에 없기때문에 import를 해주어야 한다.


		//대입할떈 리터럴, 변수도 대입이 가능
		int num2;
		num2 = 100;
		num2 = age; // num2 = 10;
		age = 17;
		System.out.println(num2);
		String nickName = "유인나";


		// 상수 -> 저장공간임 딱 한번만 값을 넣을 수 있는 저장공간.
		final int age2;
		age2 = 29;
		System.out.println(age2);


		//상수의 변수명은 통상 대문자.
		//두단어이상의 변수명은 _ 구분처리함.

		final String ADMIN_ID;
		final int ERROR_CODE1;


		//문자열에 대해 알아보자. String

		String msg;
		msg = "식객";
		System.out.println(msg);
		msg = new String("허영만"); // 생성자를 통해서 생성되기 때문에 new로 만들 수 있다.
		System.out.println(msg);

		//문자열은 문자열끼리 결합을 하려면 + 연산을 실행함.
		//10+10; -> 문자열에서 + 를 하면 결합

		msg="유인범은" + "유지태다";
		System.out.println(msg);

		msg = "유병승" + 19 +"살이다";  //문자랑 숫자 같이 값을 넣으면 문자열로 바뀐다.
		System.out.println(msg);

		msg = "이건 " +1+1+"은";
		System.out.println(msg);

		msg = "이건" + (1+1) + "은"; //괄호를 넣어서 숫자 더하기 연산후, 문자열과 더해진다.
		System.out.println(msg);

		msg = 1+2+ "귀요미";
		System.out.println(msg);

		msg = ""+1+2+" 귀요미";
		System.out.println(msg);

		msg = nickName+age; //"유인나" + 17;
		System.out.println(msg);

		//문자열변수 name, 정수형변수 age 실수형변수 height(float), weight(double)를 입력.
		//문자 변수 gender(M/F) 를
		//선언하고 각 변수에 본인의 정보를 입력하고
		//한번에 출력해보세요.(변수를 이용)

		String name1 = "유인나";
		int age1 = 29;
		float height1 = 175.8f;
		double weight1 = 65.5;
		char gender = 'M';
		System.out.println("제 이름은 " + name1 + "입니다. " +" 나이는 " + age1 + "살입니다." +
		" 키는" + height1 + "입니다.");
		System.out.println("제 몸무게는 " + weight1 +"kg입니다." + " 성별은 " + gender + "입니다.");

		
		
	}

}
