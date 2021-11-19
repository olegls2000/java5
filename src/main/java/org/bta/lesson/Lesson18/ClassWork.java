package org.bta.lesson.Lesson18;

import org.bta.lesson.model.Circle;
import org.bta.lesson.model.Point;
import org.bta.lesson.model.Slave;
import org.bta.lesson.processor.BtaNumberProcessor;
import org.bta.lesson.utils.BtaReflectionUtils;
import org.bta.lesson.utils.BtaUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class ClassWork {
    public static void main(String[] args) throws Exception {

        Slave joe = new Slave();
        Slave bill = new Slave();
        Circle circle = new Circle();

        final var clazz1 = Slave.class;
        final var clazz2 = Slave.class;
        final Class clazz = joe.getClass();
        BtaUtils.printArray(clazz.getMethods());
        System.out.println(clazz.getDeclaredMethods());

        BtaReflectionUtils.invokeMethod(bill,"secret");
        BtaReflectionUtils.invokeMethod(joe,"secret");
        BtaReflectionUtils.invokeMethod(bill,"gReAt");
        BtaReflectionUtils.invokeMethod(joe,"secReT");
        BtaReflectionUtils.invokeMethod(circle, "length");

        Point point1 = new Point(1,5);
        final var processor = new BtaNumberProcessor();
        processor.process(point1);

    }


}