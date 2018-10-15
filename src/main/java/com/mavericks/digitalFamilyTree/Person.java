package com.mavericks.digitalFamilyTree;

public class Person {

	private String name;
	private Gender gender;

	Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public String toString() {
		return name + ", " + gender;
	}
}