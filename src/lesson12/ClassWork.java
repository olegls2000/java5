package lesson12;

import java.net.SocketOption;
import java.util.Locale;

public class ClassWork {   public static void main(String[] args) {
        String strPool = "My String";
        String strPool2 = "My String";
        String strHeap = new String("My String");
        String strHeap2 = new String("My String");

        System.out.println(strPool == strPool2);
        System.out.println(strHeap == strHeap2);
        System.out.println(strPool.equals(strPool2));
        System.out.println(strPool.equals(strHeap));

        String immutable = "My name is "; // выкидывает на помойку
        immutable = immutable + "Oleg";
        System.out.println(immutable);

        StringBuilder stringBuilder = new StringBuilder("My name is "); // так правильнее (1 тип билдера)
        stringBuilder.append("***");
        stringBuilder.append(" Oleg ");
        stringBuilder.append("***");
        stringBuilder.append("!!!");
        System.out.println(stringBuilder.toString());

        StringBuffer stringBuffer = new StringBuffer("XXX"); // Второй вариант, разница в
        // методе append и он синхронизирован. Зайти в этот метод может только один поток
        stringBuffer.append(" --- ");
        stringBuffer.append(" !!! ");
        System.out.println(stringBuffer.toString());

        String a = "a"; // сравниваеи регистры
        String aU = "A";
        System.out.println(a.equalsIgnoreCase(aU));

        String aa = "tablE"; // сравниваеи регистры в словах
        String aUU = "Table";
        System.out.println(aa.toLowerCase().equals(aUU.toLowerCase()));
        String trimExamle = " Some Text    ";
        System.out.println(trimExamle.trim()); // удаляет пробелы мпереди и сзади
        System.out.println(trimExamle.charAt(2)); // вытаскиевает второй симвл 0, 1, 2
        System.out.println(trimExamle.length()); // длина строки
        System.out.println(trimExamle.indexOf('T')); // какая по счёту буква в слове / словах


        String replaceExample = "Hello Hi";
        replaceExample.replace('H', 'Y');
        System.out.println(replaceExample); // не изменит строку

        String replaceExample2 = "Hello Hi";
        replaceExample2 = replaceExample2.replace('H', 'Y');
        System.out.println(replaceExample2); // изменит строку

        String splitExample = "Hello world! I am here.";
        String[] words = splitExample.split(" ");
        System.out.println(words.length);

        splitExample.isBlank();
    }
}
