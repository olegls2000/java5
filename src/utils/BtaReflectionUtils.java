package utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

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
            throw new Exception("No default constructor for class: " + clazz.getName());
        }
        return result;


    }

    public static void invokeMethod(Object target, String sign) throws Exception {

        final var clazz = target.getClass();
        Method secretMethod = null;
        for (Method method : clazz.getDeclaredMethods()) {
            final var methodName = method.getName();

            if (methodName.toLowerCase().contains(sign.toLowerCase())){
                secretMethod = method;
            }
            if (secretMethod == null){
                System.out.println("In the class: " + clazz.getSimpleName() + " with sign: " + sign);
            }
            return;
        }
        secretMethod.setAccessible(true);
        secretMethod.invoke(target);
    }

}
