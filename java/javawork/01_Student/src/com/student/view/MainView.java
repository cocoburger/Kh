package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Student;

public class MainView {

		public void mainMenu(StudentController stc) {  //this 사용
			
		}
	//메인화면 출력해주는 메소드구현
	
	//학생관리 프로그램 출력하는 메소드
	public void mainMenu() {  
		Scanner sc = new Scanner(System.in); //관리 프로그램을 사용하기위해서 입력을 받아야한다.
		StudentController stc = new StudentController();
		while(true) { 
			System.out.println("============= 학생 관리 프로그램 ==============");
			System.out.println("1. 전체 학생조회");
			System.out.println("2. 학생등록");
			System.out.println("3. 학생성별검색(M/F)");
			System.out.println("4. 학생정보수정(나이, 주소)"); //기준 이름
			System.out.println("5. 저장학생불러오기");
			System.out.println("6. 학생 저장하기");
			System.out.println("0. 프로그램 종료");
			System.out.println("선택 :  ");
			int cho = sc.nextInt();
				switch(cho) {
					case 1 : stc.searchAll();break;
					case 2 : stc.insertStudent();break; //stc를 위에다가 해야한다. cuz, 반복문안에 있으므로 계속 새로운 객체에다가 저장을 하기때뭄
					case 3 : stc.searchGen();break;
					case 4 : stc.changeInfo();break;
					case 5 : stc.loadStudent();break;
					case 6 : stc.saveStudent();break;
					case 0 : System.out.println("프로그램 종료합니다.");return;
					
			}
				
		}
	} 	//학생등록 출력하는 메소드
		public Student inputData() {
			Scanner sc = new Scanner(System.in);
			System.out.println("========== 학생등록 ============");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 :");
			int age = sc.nextInt();
			System.out.print("성별(M/F) :");
			char gender = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("주소 :");
			String address = sc.nextLine(); 
			
			Student s = new Student(name,age,gender,address);
			return s;
			
		}
		
		//메세지출력하는 메소드 구현
		public void printMsg(String msg) {
			System.out.println();
			System.out.println("======= 시스템 메세지 =======");
			System.out.println(msg);
			System.out.println();
			System.out.println("======= 시스템 메세지 =======");
		}
		
		//성별을 선택하는 메소드 구현
		public char choiceGen() {
			Scanner sc = new Scanner(System.in);
			System.out.println("======= 검색할 성별 ======= ");
			System.out.println("1.남자 2. 여자");
			int choice =sc.nextInt();
			if(choice == 1)return 'M';
			else return 'F';
			//return sc.nextInt()==1?'M':'F';
			
		}
		
		//나이 주소를 바꾸는 메소드 구현
		public Student change() {
			Scanner sc  = new Scanner(System.in);
			Student s = new Student();
			System.out.println("======== 학생정보 수정 =========");
			System.out.print("수정할 학생이름 :");
			s.setName(sc.nextLine());
			System.out.print("나이 : ");
			s.setAge(sc.nextInt());
			System.out.print("주소 : ");
			sc.nextLine();
			s.setAddress(sc.nextLine());
			return s;
		}
		
}
