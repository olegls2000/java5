package lesson18;

import model.Circle;
import model.Point;
import model.Slave;
import processor.BtaNumberProcessor;
import utils.BtaReflectionUtils;
import utils.BtaUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassWork {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Slave bill = new Slave(20, "Bill");
        Slave joe = new Slave(800, "Joe");

        //joe.someSecretMethod();
        final var clazz = joe.getClass();
        final Class clazz1 = Slave.class;
        BtaUtils.printArray(clazz.getMethods());
        BtaUtils.printArray(clazz.getDeclaredMethods());
        BtaReflectionUtils.invokeMethod(bill, "secRet");
        BtaReflectionUtils.invokeMethod(joe, "sEcRet");
        BtaReflectionUtils.invokeMethod(joe, "great");
        BtaReflectionUtils.invokeMethod(bill, "gREat");

        Circle circle = new Circle();
        BtaReflectionUtils.invokeMethod(circle, "sEcRet");



        Method secretMethod = null;
        for (Method method : clazz.getDeclaredMethods()) {
            final var methodName = method.getName();
            if (methodName.toLowerCase().contains("secret")) {
                secretMethod = method;
            }
        }
        secretMethod.setAccessible(true);

        secretMethod.invoke(joe);
        secretMethod.invoke(bill);

        final var processor = new BtaNumberProcessor();
        Point point1 = new Point(2,5);
        processor.process(point1);
    }

}


