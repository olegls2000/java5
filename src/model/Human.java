package model;

//TODO add incaps
public class Human {
	
	private String firstName;
	private String lastName;
	private Gender gender;

	public String getFirstName() {
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public Gender getGender(){
		return gender;
	}
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	public void setGender(Gender newGender) {
		gender = newGender;
	}

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

	public void setFirstName() {
	}
}
