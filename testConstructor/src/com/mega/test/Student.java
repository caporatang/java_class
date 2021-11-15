package com.mega.test;

import java.lang.reflect.Constructor;
// public class Student extends Object
public class Student {
	String name;
	int age;
	
	// 생성자
	public Student() {
		// super();
		// 자바는 묵시적이기 때문에 생략 가능하다
	}

	public Student(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	public void study() {
		System.out.println("공부하다");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
