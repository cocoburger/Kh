package com.student.model.dao;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.student.model.vo.Student;

public class StudentDao   {
	//프로그램에서  동작하는 데이터저장 역할
	
//	private Student s1;
//	private Student s2;
//	private Student s3;
//	private Student s4;
//	private Student s5;

	
	private Student[] students = new Student[5];
	private int studentCount;
	
	public StudentDao () {}
	
	
	
	
	
	//매개변수로 전달된 값을 저장소(멤버변수)에 저장하는 기능
	
	public boolean insertStudent(Student s) {
		//1.비어 있는 변수를 찾아서 저장
		
		boolean flag = true;
		for(int i = 0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = s;
				flag = false;
				break;
			}
		   }
		try {
			students[studentCount++]=s;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			//students.배열의 길이를 증가
			//단. 이전값을 유지하면서!
			Student[] temp = new Student[students.length+10];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
			students[studentCount]=s;
		}
		return flag;
		}
		
		
//		
//		if(sdt[0] == null) {
//			//s1변수가 비어있다는 의미. 참조형 주소값이 들어가는 변수에는 null이 들어간다.
//			sdt[0] = s;
//		}else if(sdt[1] == null) {
//			sdt[1] = s;
//		}else if(sdt[2] == null) {
//			sdt[2] = s;
//		}else if(sdt[3] == null) {
//			sdt[3] = s;
//		}else if(sdt[4] == null) {
//			sdt[4] = s;
//		}else {
//			System.out.println("저장공간 없음!");
			

	public String searchAll() {
		//멤버변수에 있는 데이터를 반환.
		//멤버변수에 값이 없으면 반환하지 않음.
		String students="";  //students가 중복되기 때문에 this.를 사용
		for(int i = 0; i<this.students.length; i++) {
			if(this.students[i] != null) {
				students += this.students[i].studentInfo()+"\n";
			}
		}
		return students;
		
//		if(sdt[0] != null) {
//		students +=sdt[0].studentInfo()+"\n"; //studentInfo 매소드를 호출한 걸 students에 대입한다.
//		}if(sdt[1] != null) {
//			students +=sdt[1].studentInfo()+"\n";
//		}if(sdt[2] != null) {
//			students +=sdt[2].studentInfo()+"\n";
//		}if(sdt[3] != null) {
//			students +=sdt[3].studentInfo()+"\n";
//		}if(sdt[4] != null) {
//			students +=sdt[4].studentInfo()+"\n";
//		}
		
		
		
		
		
		
	}
	public String searchGen(char gender) {
		String students = "";
		for(int i = 0; i<this.students.length; i++) {
			if(this.students[i] != null&&this.students[i].getGender()==gender) {
				students+= this.students[i].studentInfo()+"\n";
				}
			}
		return students;
		}
		
		
//		String students = "";
//		
//		if(sdt[0]!=null&&sdt[0].getGender() == gender) {
//			students +=sdt[0].studentInfo()+"\n";
//			
//		}if(sdt[1]!=null&&sdt[1].getGender() == gender) {
//			students +=sdt[1].studentInfo()+"\n";
//			
//		}if(sdt[2]!=null&&sdt[2].getGender() == gender) {
//			students +=sdt[2].studentInfo()+"\n";
//			
//		}if(sdt[3]!=null&&sdt[3].getGender() == gender) {
//			students +=sdt[3].studentInfo()+"\n";
//			
//		}if(sdt[4]!=null&&sdt[4].getGender() == gender) {
//			students +=sdt[4].studentInfo()+"\n";
//		}
//		
//		return students;
		
	
	public boolean change(Student s) {
		boolean flag = false;
		
		for(int i = 0; i<students.length; i++) {
			if(students[i]!=null&&students[i].getName().equals(s.getName())) {
				students[i].setAge(s.getAge());
				students[i].setAddress(s.getAddress());
				flag = true;
				break;
			}
		}
		return flag;
	 }
		
//		if(sdt[0]!=null&&sdt[0].getName().equals(s.getName())) {
//			sdt[0].setAge(s.getAge());  
//			sdt[0].setAddress(s.getAddress()); 
//		}
//		else if(sdt[1]!=null&&sdt[1].getName().equals(s.getName())) {
//			sdt[1].setAge(s.getAge());  
//			sdt[1].setAddress(s.getAddress()); 
//		}
//		else if(sdt[2]!=null&&sdt[2].getName().equals(s.getName())) {
//			sdt[2].setAge(s.getAge());  
//			sdt[2].setAddress(s.getAddress()); 
//		}
//		else if(sdt[3]!=null&&sdt[3].getName().equals(s.getName())) {
//			sdt[3].setAge(s.getAge());  
//			sdt[3].setAddress(s.getAddress()); 
//		}
//		else if(sdt[4]!=null&&sdt[4].getName().equals(s.getName())) {
//			sdt[4].setAge(s.getAge());  
//			sdt[4].setAddress(s.getAddress()); 
//		}else {
//			flag = false;
//		}
		
	 
	
	 public String printGrade () { //매개변수가 있다면 한명의 사람만 출력
			String data = "";
			int sum = 0;
			for(int i = 0; i<students.length; i++) {
				sum = students[i].getKor()+students[i].getEng()+students[i].getMath()
						+students[i].getCoding();
				data+=students[i].getName()+" "+sum+" "+sum/4.0+"\n";
				}
			 return data;
			}
	 
	//입력한 학생정보 file에 저장하고 가져오기
	 
	 //파일에서 데이터 불러오기
	 public void loadStudent() {
		 try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"))){
				
					students = (Student[])ois.readObject();
					
					
		 		}catch(ClassNotFoundException e) {
		 			e.printStackTrace();
		 		}catch(IOException e) {
					e.printStackTrace();
		 		}
		}
	 
	 
	 	//파일에 저장
	 	public void saveStudent() {
	 			try(ObjectOutputStream oos
					=new ObjectOutputStream(new FileOutputStream("student.dat"))){
	 			oos.writeObject(students);
	 			
	 			}catch(IOException e) {
	 				e.printStackTrace();
	 		}
		}
	}	






//			 int sum = 0;
//			 if(s1!=null) {
//				 sum = s1.getKor()+s1.getEng()+s1.getMath()+s1.getHistory()
//				 +s1.getChemistry();
//				 data+=s1.getName()+" "+sum+" "+sum/5.0+"\n"; 
//			 }if(s2!=null) {
//				 sum = s2.getKor()+s2.getEng()+s2.getMath()+s2.getHistory()
//				 +s2.getChemistry();
//				 data+=s2.getName()+" "+sum+" "+sum/5.0+"\n"; 
//			 }if(s3!=null) {
//				 sum = s3.getKor()+s3.getEng()+s3.getMath()+s3.getHistory()
//				 +s3.getChemistry();
//				 data+=s3.getName()+" "+sum+" "+(sum/5.0)+"\n"; 
//			 }
			 
			 
			 
