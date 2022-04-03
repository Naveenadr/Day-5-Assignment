package org.student;

import org.department.Department;

public class Student extends Department {
	
	
	public void studentName () {
		System.out.println ("Naveena D R");
		}
	public void studentDept () {
		System.out.println ("Student dept is ECE");
	}
	
	public void studentId () {
		System.out.println ("Student id is 24");
	}

	public static void main(String[] args) {
		Student myStudentdetail = new Student ();
		myStudentdetail.studentName();
		myStudentdetail.studentId();
		myStudentdetail.studentDept();
		myStudentdetail.deptName();
		myStudentdetail.collegeName();
		myStudentdetail.collegeCode();
		myStudentdetail.collegeRank();
		
	

	}

}
