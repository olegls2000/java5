package org.bta.lesson.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class BtaReflectionUtils {
    public static Constructor getDefaultConstructorOrThrow(Class clazz) throws Exception {
        Constructor result = null;
        for (Constructor constructor : clazz.getConstructors()) {
            if (constructor.getParameterCount() == 0) {
                result = constructor;
                break;
            }
        }
        if (result == null) {
            throw new Exception("No default Constructor for class: " + clazz.getName());
        }
        return result;
    }

    public static <T> Set<T> generateByClass(Class<T> clazz, int count) throws Exception {
        final Set<T> result = new HashSet<>();
        final Constructor<T> defaultConstructor = getDefaultConstructorOrThrow(clazz);
        for (int i = 0; i < count; i++) {
            final T instance = defaultConstructor.newInstance();
            result.add(instance);
        }
        return result;
    }

    public static void invokeMethod(final Object target, final String sign) throws Exception {
        final var clazz = target.getClass();
        Method secretMethod = null;
        for (Method method : clazz.getDeclaredMethods()) {
            final var methodName = method.getName();
            if (methodName.toUpperCase().contains(sign.toUpperCase())) {
                secretMethod = method;
            }
        }
        if(secretMethod == null){
            System.out.println("In class: " + clazz.getSimpleName() + " no method with sign: " + sign);
            return;
        }
        secretMethod.setAccessible(true);
        secretMethod.invoke(target);
    }
}
