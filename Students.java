package com.te.practiceweek;

import java.util.Comparator;

public class Students implements Comparator<Student> {
	int id;
	String name;
	double per;
	int age;
	String grade;
	
	public Students(int id, String name, double per, int age) {
		
		this.id = id;
		this.name = name;
		this.per = per;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[ id=" + id + ", name=" + name + ", per=" + per + ", age=" + age + "]";
	}
	
	@Override
	public int compare(Student o1, Student o2) {
		return o1.age-o2.age;
		//return o1.id-o2.id;
	}	
}
