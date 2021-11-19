package org.bta.lesson.model;

//TODO add incaps
public class Human {
	public String firstName;
	public String lastName;
	public Gender gender;

	public Human(String firstName,
				 String lastName,
				 Gender gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;

	}
	public Human()	{
	}
	public void marriage(Human couple) {
		if (couple.gender == Gender.WOMAN) {
			couple.lastName = this.lastName;
		} else {
			this.lastName = couple.lastName;
	}
	}
    @Override
	public String toString(){

		return "[ First Name: " + this.firstName +
				", Last Name: " + this.lastName +
				", gender: " + this.gender +
				"]";
	}
}
