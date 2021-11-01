package lesson13;

import utils.BtaStringUtils;

import java.util.*;

public class ClassWork {
    public static void main(String[] args) {
        String sentence = "Hi Joe.I Am Joe too! Hi joe, them.";
        BtaStringUtils.printDuplicates(sentence);

        List<String> myList = new ArrayList();
        System.out.println(myList.size());
        myList.add("One");
        myList.add("6");
        myList.add("6.99");
        myList.add("Remove this text");
        myList.add("Don't remove this text");
        System.out.println(myList.size());
        String element = myList.get(0);
        boolean wasDeleted = myList.remove("6");
        boolean wasDeleted2 = myList.remove("Remove this text");
        boolean con = myList.containsAll(Arrays.asList("One", "6", "Remove this text", "Don't remove this text"));
        System.out.println(myList);


        Set<TestClass> hashSet = new HashSet<>();  // считаем хэш по count и name
        hashSet.add(new TestClass(2, "2"));
        hashSet.add(new TestClass(3, "3"));
        hashSet.add(new TestClass(3, "4"));
        hashSet.add(new TestClass(2, "2")); // выкидываем эту уйню
        System.out.println(hashSet.size());
    }
}
