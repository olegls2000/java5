package lesson6;

import model.Gender;
import model.Human;
import model.Point;
import utils.BtaUtils;

//TODO rename
public class Main6 {

    public static void main(String[] args){
    Human ivan = new Human("Ivan", "Ivanov", Gender.MAN);
    Human darja = new Human("Darja", "Petrova", Gender.WOMAN);

    // ivan.marriage(darja); // дарья берёт фамилию ивана из вкладки Human
    darja.marriage(ivan); // наоборот
    System.out.println("...");

    int i = 2;
    doSmth(i);
    doSmth(ivan);

    //Константы из начала BtaUtils
    System.out.println(BtaUtils.MY_LUCKY_NUMBER);
    BtaUtils.JOE.firstName = "NewName";
                    // BtaUtils.JOE = ivan; - так нельзя!!!!!!
            doSmth(BtaUtils.JOE);

            System.out.println(BtaUtils.JOE);


            int k = 0;
            boolean condition = true;
            if (condition) {
                k = 1;
            }else{
                k = 2;
            }
            // k = condition ? 1 : 2; - тернарный оператор - заменяет большой скрипт (вместо if)
                System.out.println("K = " + k);

            // относится к вкладке Point и calculateDistance в BtaUtils
            Point a = new Point(1, 2);
            Point b = new Point(3, 4);
            double distance = BtaUtils.calculateDistance(a, b);
            System.out.println("Distance between point " + a + " and " + b + " is " + distance);
            System.out.println(a);
    }

    public static void doSmth(int i){
        i += 2;
    }
    public static void doSmth(Human human) {
        human.lastName = "NewLastName";
    }



}
