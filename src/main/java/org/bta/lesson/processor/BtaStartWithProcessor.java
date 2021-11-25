package org.bta.lesson.processor;



import org.bta.lesson.annotation.BtaStartWith;

import java.lang.reflect.Field;

public class BtaStartWithProcessor implements BtaProcessor {
    @Override
    public void process(Object objectToProcess) throws Exception {
        final Class clazz = objectToProcess.getClass();
        final Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (!field.isAnnotationPresent(BtaStartWith.class)) {
                continue;
            }
            if (field.getType() != String.class) {
                throw new RuntimeException("Annotation placed on incompatible type");
            }
            final BtaStartWith annotation = field.getAnnotation(BtaStartWith.class);
            final String startChar = annotation.value();
            Object rawValue = field.get(objectToProcess);
            final String value = (String) rawValue;
            if (!value.startsWith(startChar)) {
                throw new RuntimeException("Invalid value, must start with " + startChar);
            }
        }
        System.out.println("Object is valid");
    }
}
