package com.student.common;

import com.student.model.vo.Student;

public interface StudentDaointer {

		boolean insertStudent(Student s);
		String searchAll();
		void mainMenu();
		
		String searchGender(char gender);
		boolean  change(Student s);
		String printGrade();
		void loadStudent();
		void saveStudent();
}
