package utils;

import java.lang.reflect.Constructor;
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

    public static <T> Set<T> generateByClass(Class<T> clazz, int count) throws Exception{
        final Set<T> result = new HashSet<>();
        final Constructor<T> defaultConstructor = getDefaultConstructorOrThrow(clazz);
        for (int i = 0; i < count; i++) {
            final T instance = defaultConstructor.newInstance();
            result.add(instance);
        }
        return result;
    }
}
