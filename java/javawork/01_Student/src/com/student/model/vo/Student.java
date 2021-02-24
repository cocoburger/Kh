package com.student.model.vo;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8110131369552228399L;
		//학생정보를 저장하는 객체
		private String name; //학생이름 
		private int age; //나이, 음수는 대입금지
		private char gender; //성별 남/녀
		private String address; //주소
		private int kor; //국어
		private int	eng; //영어
		private int math; //수학
		private int coding; //코딩
		
		public Student() {}
		
		//매개변수 있는 생성자로 매개변수에 있는 값을 멤버변수에 대입하는 것
		public Student(String name, int age, char gender, String address) {
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.address = address;
			
		}
		
		
		public void setName(String name) {
			this.name = name;  //외부의 값을 주는거니깐 객체와 자료형이 동일해야한다.
		}
		public String getName() {
			return name; //반환해야하니깐 반환할 자료형이랑 객체 자료형이랑 동일해야한다.
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		public int getAge() {
			return age;
		}
		
		public void setGender(char gender) {
			this.gender = gender;
		}
		public char getGender() {
			return gender;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAddress() {
			return address;
		}
		
		
		
		
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getKor() {
			return kor;
		}
		
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getEng() {
			return eng;
		}
		public void setMath(int math) {
			this.math = math;
		}
		public int getMath() {
			return math;
		}
		public void setCoding(int coding) {
			this.coding = coding;
		}
		public int getCoding() {
			return coding;
		}
		
		//학생정보를 모두 출력하는 메소드 구현하기 -> return 해야한다.
		//항목(멤버변수) 간격은\t로출력하고 값은 String으로 반환하는 메소드임.  -> 자료형 타입이 String
		//studentInfo()  //메소드명
		
		public String studentInfo() {
			
			return name+"\t"+age+"\t"+gender+"\t"+address+"\t"
					+kor+"\t"+eng+"\t"+math+"\t"+coding;
			
			
		}
		
}
