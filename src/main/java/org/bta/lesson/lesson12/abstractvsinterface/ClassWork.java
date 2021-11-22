package org.bta.lesson.lesson12.abstractvsinterface;

public class ClassWork {
    public static void main(String[] args) {
        String strPool = "My String";
        String strPool2 = "My String";
        String strHeap = new String("My String");
        String strHeap2 = new String("My String");

        System.out.println(strPool == strPool2);
        System.out.println(strHeap == strHeap2);

        System.out.println(strPool.equals(strPool2));
        System.out.println(strPool.equals(strHeap));

        String immutable = "My name is ";
        immutable = immutable + "Oleg";
        System.out.println(immutable);

        StringBuilder stringBuilder = new StringBuilder("My name is ");
        stringBuilder.append("Oleg").append("!");
        System.out.println("Tra lal ala ");
        stringBuilder.append("!!!!!");
        System.out.println(stringBuilder.toString());

        StringBuffer stringBuffer = new StringBuffer("XXX");
        stringBuffer.append("-");
        //equals, equals ignorecase, trim(), charAt(int);
        // indexOf(char); substring(int, int); replace(char, char);
        // contains(); startWith(char), split(char)

        String a = "tablE";
        String aU = "Table";
        System.out.println(a.toLowerCase().equals(aU.toLowerCase()));
        System.out.println(a.equalsIgnoreCase(aU));
        String trimExample = "012Some Text           ";
        trimExample = trimExample.trim();
        System.out.println(trimExample);
        System.out.println(trimExample.charAt(2));
        System.out.println(trimExample.length());
        System.out.println(trimExample.indexOf('X'));
        String replaceExample = "Hello Hi";
        replaceExample = replaceExample.replace('H', 'Y');
        System.out.println(replaceExample);
        String splitExample  = "Hello World! I am here.";
        String[] words = splitExample.split(" ");

        System.out.println(words.length);
        splitExample.isBlank();
    }
}
