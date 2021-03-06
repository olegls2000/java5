package org.bta.lesson.lesson13;




import org.bta.lesson.utils.BtaStringUtils;

import java.util.*;


public class ClassWork {
    public static void main(String[] args) {
        String sentence = "Hi Joe.I am Joe too! Hi joe, then.";
        BtaStringUtils.printDuplicates(sentence);

        Collection<String> myList = new ArrayList();
        Collection<String> myList1 = new LinkedList<>();
        System.out.println(myList.size());
        myList.add("One");
        myList.add("6");
        myList.add("6.99");
        System.out.println(myList.size());
        //String element = myList.get(0);
        boolean wasDeleted = myList.remove("6");
        boolean isContains = myList.containsAll(Arrays.asList("One", "6"));

        Set<TestClass> hashSet = new HashSet<>();
        hashSet.add(new TestClass(2, "2"));
        hashSet.add(new TestClass(3, "3"));
        hashSet.add(new TestClass(2, "2"));
        System.out.println(hashSet.size());
    }
}
