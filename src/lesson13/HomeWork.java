package lesson13;

import utils.BtaUtils;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HomeWork {
    public static void main(String[] args) {
        ArrayList<String> myColors = new ArrayList<>();
        myColors.add("WHITE");
        myColors.add("BLACK");
        myColors.add("GREEN");
        myColors.add("YELLOW");
        myColors.add("BLUE");
        myColors.add("BROWN");
        myColors.add("RED");
        System.out.println("Colors is : " + myColors);


        Iterator<String> myIteratorColor = myColors.iterator();

        while (myIteratorColor.hasNext()) {
            String element = myIteratorColor.next();
            System.out.println(element + "  ");
        }

        for (int i = 0; i < 10; i++) {
            myColors.add(0, "Color" + (10 - i));
        }
        System.out.println(myColors);

        String tempElement = "TEMPCOLOR";
        int index = 14;
        String element = myColors.get(index);
        System.out.println("Element index " + index + "  before changes  is : " + element);


        myColors.set(index, element + tempElement);
        String changedElement = myColors.get(index);
        System.out.println("Element index " + index + "  after changes  is : " + changedElement);

        myColors.remove(3);
        System.out.println(myColors);
        myColors.remove(3);
        System.out.println(myColors);

        //TODO
        String searchedElement = "WHITE";

        for (int i = 0; i < myColors.size(); i++) {

            String tempElement1 = myColors.get(i);
            if (tempElement1.equalsIgnoreCase(searchedElement)) {
                System.out.println(" Element equalent is  :  " + tempElement1);
            }


        }


        ArrayList myColorNew = new ArrayList();
        myColorNew = myColors;
        System.out.println("New Array myColorNew is : " + myColorNew);


/////////////////////////////////////////////////////////

        ArrayList myColorReverse = new ArrayList();

        int lenghtTemp = myColorNew.toArray().length;
        System.out.println(lenghtTemp);


        for (int i = 0; i < lenghtTemp; i++) {

            myColorReverse.add(i, myColorNew.get(lenghtTemp - i));

        }
        System.out.println("REVERSE IS  :  " + myColorReverse);


        /////////////////
        ArrayList myColorShuffle = new ArrayList();


        //    Iterator<String> myIteratorColorNew = myColorNew.iterator();


        for (int i = 0; i < myColorNew.size(); i++) {

            myColorShuffle.add(BtaUtils.getRandom(0, myColorNew.size()), myColorNew.get(myColorNew.size() - i));

        }
        System.out.println("REVERSE IS  :  " + myColorReverse);


        System.out.println("THE END");
    }

}
