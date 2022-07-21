package org.collage;

public class Student extends dept{
	private void studentName() {
		System.out.println("studentName is Dharmendra");
		}
	private void studentDept() {
		System.out.println("studentDept is MPC");
		}
	private void studentId() {
		System.out.println("studentId is 0993");
		}
	public static void main(String[] args) {
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.collageName();
		s.collageCode();
		s.collageRank();
		s.hostelName();
		s.deptName();
		
	}

}
