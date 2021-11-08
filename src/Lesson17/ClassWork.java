package Lesson17;

import Lesson10.Triangle;

import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.Set;

import static utils.BtaReflectionUtils.getDefaultConstructorOrThrow;

public class ClassWork {
    public static void main(String[] args) throws Exception {
        Triangle object = new Triangle();

        final Class clazz = object.getClass();
        System.out.println("Class name: " + clazz.getName());
        System.out.println("Class simple name: " + clazz.getSimpleName());
        System.out.println("Super Class simple name: " + clazz.getSuperclass().getName());
        System.out.println("Interface name: " + clazz.getInterfaces()[0].getName());
        System.out.println("Constructor count: " + clazz.getConstructors()[0].getParameterCount());
        System.out.println("Method count: " + clazz.getMethods().length);

        Class triangleClass = object.getClass();

        Set<Triangle> triangles = generateByClass(Triangle.class, 900000000);
        System.out.println(triangles);
    }

    private static <T> Set <T> generateByClass(Class<T> clazz, int count) throws Exception{
       final Set<T> result = new HashSet<>();
       final Constructor<T> defaultConstructor = getDefaultConstructorOrThrow(clazz);

       for (int i = 0; i < count; i++) {
            T instance = defaultConstructor.newInstance();
            result.add(instance);


        }
        return result;

    }
}
