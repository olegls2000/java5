package org.bta.lesson.lesson17;


import org.bta.lesson.lesson10.Triangle;

import java.util.Set;

import static org.bta.lesson.utils.BtaReflectionUtils.generateByClass;


public class ClassWork {

    public static void main(String[] args) throws Exception {
        Object object = new Triangle();

        final Class clazz = object.getClass();
        System.out.println("Class name: " + clazz.getName());
        System.out.println("Class simple name: " + clazz.getSimpleName());
        System.out.println("Super Class name: " + clazz.getSuperclass().getName());
        System.out.println("Interface name: " + clazz.getInterfaces()[0].getName());
        System.out.println("Constructors count: " + clazz.getConstructors()[1].getParameterCount());
        System.out.println("Methods count: " + clazz.getMethods().length);

        Class triangleClass = object.getClass();
        Set<Triangle> triangles = generateByClass(Triangle.class, 90000000);
        System.out.println(triangles);
    }
}
