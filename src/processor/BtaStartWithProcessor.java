package processor;

import annotation.BtaStartWith;

import java.lang.reflect.Field;

public class BtaStartWithProcessor implements  BtaProcessor{
    public void process(Object objectToProcess) throws IllegalAccessException {
        final Class clazz = objectToProcess.getClass();
        final Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (!field.isAnnotationPresent(BtaStartWith.class)) {
                continue;
            }
            if(field.getType() != String.class) {
                throw new RuntimeException("Annotation place ");
            }
            final var annotation= field.getAnnotation(BtaStartWith.class);
            final var startChar = annotation.value();
            Object rawValue = field.get(objectToProcess);
            final var value = (String) rawValue;
            if (!value.startsWith(startChar)) {
                throw new RuntimeException("Invalid value, must start with " + startChar);
            }
        }
        System.out.println("Object is valid!");
    }
}

