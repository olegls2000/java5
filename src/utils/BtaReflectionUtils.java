package utils;

import java.lang.reflect.Constructor;

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
}
