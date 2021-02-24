package com.vari.controller;

import java.util.Scanner;

//기능제공용 클래스
public class Controller {

// main은 실행용에만 있으면 가능.
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("나이  :");
		int age = sc.nextInt();

		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);

		System.out.print("키 : ");
		double height = sc.nextDouble();

		System.out.print("주소 : ");
		sc.nextLine();
		String address = sc.nextLine();

		System.out.println("이름 : "+name+"  나이  : " +age+" 성별  :" +gender+" 키  :"+height+
				" 주소 : " + address);

	}
}
