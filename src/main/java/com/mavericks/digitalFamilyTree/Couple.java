package com.mavericks.digitalFamilyTree;

public class Couple {
	Person descendant;
	Person spouse;

	Couple(Person descendant) {
		this.descendant = descendant;
	}

	Couple(Person descendant, Person spouse) {
		this.descendant = descendant;
		this.spouse = spouse;
	}

	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}

	@Override
	public String toString() {
		return descendant.toString()  + (spouse != null ? " & " + spouse.toString() : "");
	}

	public Person getDescendant() {
		return descendant;
	}

	public Person getSpouse() {
		return spouse;
	}

}