package model;

public class Human {

    String firstName;
    String lastName;
    Gender gender; // поле enum в gender

    public Human(String firstName, String lastName, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
// дефолтный (автоматический) конструктор
    //public Human(){
    //}

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
