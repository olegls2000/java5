package lesson18;

import model.Circle;
import model.Point;
import model.Slave;
import processor.BtaNumberProcessor;
import utils.BtaReflectionUtils;
import utils.BtaUtils;

import java.lang.reflect.Method;

// Vzlom privatnogo metoda !!!!   Cherez Reflection
public class ClassWork {
    public static void main(String[] args) throws Exception {
        Slave bill = new Slave(20, "Bill");
        Slave joe = new Slave(800, "Joe");


        //  joe.someSecretMethod();
        final Class clazz = joe.getClass();
        //    final Class clazz1 = Slave.getClass();

        BtaUtils.printArray(clazz.getMethods());
        BtaUtils.printArray(clazz.getDeclaredMethods());

        BtaReflectionUtils.invokeMethod(bill, "SecRet");
        BtaReflectionUtils.invokeMethod(joe, "Secret");
        BtaReflectionUtils.invokeMethod(joe, "great");

        Circle circle = new Circle();
        BtaReflectionUtils.invokeMethod(circle, "secRet");

///////////////////////////
        final var processor = new BtaNumberProcessor();

        Point point1 = new Point(2, 5);
        Point point2 = new Point(999, 999);
        processor.process(point1);
        processor.process(point2);

    }


}

