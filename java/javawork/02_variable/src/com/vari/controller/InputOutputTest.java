package com.vari.controller;

import java.util.Scanner;

public class InputOutputTest {

		public static void main(String[] args) {
			//print()매소드 사용해보기
			int num = 100;
			String name = "유인나";
			System.out.print(num);
			System.out.print(name);
			System.out.println(); //개행하기
			System.out.println(num);
			System.out.println(name);



			//printf 매소드 사용법

			System.out.printf("%d %s\n", num, name );
			System.out.printf("%s\n", "rclass강의장");
			double dnum = 180.5;
			System.out.printf("%.1f\n", dnum);
			System.out.printf("%.2f\n", dnum);

			//정렬이 가능함
			System.out.printf("%-6s \t %3d %f\n", "유인나",29,186.7); // s앞에 숫자를 넣어서 정렬 할 수있다.
			System.out.printf("%-6s  \t %3d %.2f\n", "인뱀",29,198.7);


			//escape문 처리하기
			System.out.println("안녕\t하세요.\t힘내세요\t");
			System.out.println("안녕\\호호\\");
			System.out.println("c:\\Users\\user1");
			//그가 말했다. "야호"
			System.out.println("그가 말했다. \"야호\"");
			System.out.println("'그가 말했다.'" );

			//Scanner 객체를 통한 입력값 받아오기!
			//1. import --> import java.until.Scanner;
			//2. Scanner를 생성 --> new Scanner(System.in);
			//3. 받을 데이터의 자료형에 맞는 메소드를 사용
			// - int sc.nextInt();
			// - double sc. nextDouble();
			// - String sc.next();
			// - String sc.nextLine();
			Scanner sc = new Scanner(System.in);
			/*
			 Scanner sc = new Scanner(System.in); System.out.print("당신의 나이를 입력(숫자로입력) :");
			 * int age = sc.nextInt(); System.out.print("당신의 키 입력 : "); double height =
			 * sc.nextDouble(); System.out.print("당신의 이름은 : "); sc.nextLine(); //버퍼를 비우기
			 * String name1 = sc.nextLine(); System.out.println("당신의 이름은 " + name1 +" 나이는 "+
			 * age +"살이네요! 키는 " + height + "cm");
			 */

			//char를 받아오는 메소드는 없다. String 문자열에서 제공하는 메소드를 사용.
			System.out.print("성별 : ");
			char gender1 = sc.next().charAt(0); //"남자" 입력후 charAt(2) 로 설정하면 공백만 나온다.
			System.out.println(gender1);
	
		
		
		
		//자바 객체지향 -> 객체간 서로 기능을 호출해서 사용
			
		
		
		
		
		
		
		
		}
}
