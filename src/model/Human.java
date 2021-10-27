package model;

public class Human {
    private String firstName;
    private String lastName;
    private Gender gender; // поле enum в gender

    public Human(String firstName, String lastName, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
// дефолтный (автоматический) конструктор
    //public Human(){
    //}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void marriage(Human couple) {
        if (couple.gender == Gender.WOMAN) {
            couple.lastName = this.lastName;
        }else{
            this.lastName = couple.lastName;
        }
    }

@Override
    public String toString(){
        return "[ First Name : " + this.firstName + ", Last Name: " + this.lastName + ", gender: " + this.gender + "]";
    }

}