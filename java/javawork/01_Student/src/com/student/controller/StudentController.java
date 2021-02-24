package com.student.controller;

import com.student.common.StudentDaointer;
import com.student.model.dao.StudentDao;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentController {

		private StudentDaointer dao1;
		
		private StudentDao dao = new StudentDao();  //외부객체를 사용하기위해서 객체생성
		private MainView view = new MainView(); //외부객체를 사용하기 위해서 객체생성
	
		public void mainMenu() {
			//메인화면 호출해주는 기능
			loadStudent();
			
			view.mainMenu(this); //this사용
			
			saveStudent();
		}
		
		//사용자가 입력한 데이터를 dao의 맴버변수에 저장해준다.
		//1. 사용자에게 데이터 입력받아야함. --> 입력화면을 출력!
		public void insertStudent() {
			Student s = view.inputData();
			
			//2.화면에서 받아온값을 dao의 저장소에 저장.
			boolean flag = dao.insertStudent(s); //dao에 저장해야하니깐 저장한 결과를 불러오는거다.
			//student 저장결과에 따라 메세지 출력 시키기
			view.printMsg(flag? "입력성공":"등록실패");
			
		}
		
		public void searchAll() {
			//dao 멤버변수에 있는 값 출력하기
			String students = dao.searchAll();
			view.printMsg(students.equals("")?"저장된 데이터가 없습니다.":students); 
			
		}
		
		
		public void searchGen() {
			//1. 성별을 기준으로 학생을 조회하다
			char gender = view.choiceGen();
			String students =  dao.searchGen(gender);
			view.printMsg(students.equals("")?"조회된 데이터가 없습니다.":students);
		}
		
		public void changeInfo() {
			//1.수정화면을 출력
			searchAll();
			Student s = view.change();
			boolean flag = dao.change(s);
			view.printMsg(flag?"수정 성공":"수정 실패");
			
		}
		public void printGrade() {
			String d = dao.printGrade();
			view.printMsg(d);
			//view.printGrade(d);
		}
		
		public void loadStudent() {
			dao.loadStudent();
		}
		
		public void saveStudent() {
			dao.saveStudent();
		}
	} 
	 



