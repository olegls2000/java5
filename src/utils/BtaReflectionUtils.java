package utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

    public static void invokeMethod(final Object target, final String sign) throws InvocationTargetException, IllegalAccessException {
        final var clazz = target.getClass();
        Method secretMethod = null;
        for (Method method : clazz.getDeclaredMethods()) {
            final var methodName = method.getName();
            if (methodName.toLowerCase().contains(sign.toLowerCase())) {
                secretMethod = method;
            }
            if (secretMethod == null) {
                System.out.println(
                        "In the class: " + "No method with sign: " + sign

                );
                return;
            }

        }
        secretMethod.setAccessible(true);
        secretMethod.invoke(target);
    }
}




