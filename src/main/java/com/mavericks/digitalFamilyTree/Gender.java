package com.mavericks.digitalFamilyTree;

public enum Gender {
	MALE("M"), 
	FEMALE("F");

	private String abbreviation;

	private Gender(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	@Override
	public String toString() {
		return abbreviation;
	}

}