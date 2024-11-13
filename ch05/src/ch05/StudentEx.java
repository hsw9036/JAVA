package ch05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student1 {
	private String name;
	private String department;
	private String id;
	private double grade;

	public Student1(String name, String department, String id, double grade) {

		this.name = name;
		this.department = department;
		this.id = id;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

}

public class StudentEx {

	Scanner sc = new Scanner(System.in);
	ArrayList<Student> dept = new ArrayList<Student>();

	private void read() {
		System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요 : >> ");
		for (int i = 0; i < 4; i++) {
			System.out.print(" >>> ");
			String name = sc.next();
			String department = sc.next();
			String id = sc.next();
			Double grade = sc.nextDouble();

			Student1 student1 = new Student1(name, department, id, grade);
			dept.add(student1);
		}
	}

	private void printAll() {
		Iterator<Student1> it = dept.iterator();
		while (it.hasNext()) {
			Student1 student1 = it.next();
			System.out.println("-------------");
			System.out.println("이름 : " + student1.getName());
			System.out.println("학과 : " + student1.getDepartment());
			System.out.println("학번 : " + student1.getId());
			System.out.println("학점평균 : " + student1.getGrade());
		}
	}

	private void processQuery() {
		while (true) {
			System.out.println("학생 이름 >> ");
			String name = sc.nextLine();
			if (name.equals("그만"))
				return;
			for (int i = 0; i < dept.size(); i++) {
				Student1 student1 = dept.get(i);
				if (student1.getName().equals(name)) {
					System.out.println(student1.getName() + ",");
					System.out.println(student1.getDepartment() + ",");
					System.out.println(student1.getId() + ",");
					System.out.println(student1.getGrade() + ",");
					break;
				}
			}
		}
	}

	public void run() {
		read();
		printAll();
		processQuery();
	}

	public static void main(String[] args) {

		StudentEx mn = new StudentEx();
		mn.run();

	}

}
