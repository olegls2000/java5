package org.bta.lesson.lesson12.abstractvsinterface;

public class ClassWork {

    // STROKI

    public static void main(String[] args) {
        String strPool = "My string";
        String strPool2 = new String("My String");
        String strHeap = new String("My String");
        String strHeap2 = new String("My String");

        System.out.println(strPool == strPool2);
        System.out.println(strHeap == strHeap2);

        System.out.println(strPool.equals(strPool2));

        String immutable = "My name is";
        immutable += "  Oleg";
        System.out.println(immutable);


        StringBuilder stringBuilder = new StringBuilder("My name is");
        stringBuilder.append("Oleg");
        stringBuilder.append("!!!!");
        stringBuilder.append("!!!! Da DA DA");
        System.out.println(stringBuilder.toString());


        StringBuffer stringBuffer = new StringBuffer("XXXX");  // в бафере  только один поток - synhronized !!!
        stringBuffer.append("-");


        String a = "taBle";
        String aU = "TablE";
        System.out.println(a.equalsIgnoreCase(aU));

        String trimExample = "  Some    Text          ";
        System.out.println(trimExample.trim());

        System.out.println(trimExample.charAt(2));

        System.out.println(trimExample.indexOf('T'));

        //replace

        String splitExample = " Hello World! I am here.";
        String[] words = splitExample.split(" ");
        System.out.println(words.length);



    }

}
