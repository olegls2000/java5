package org.bta.lesson.processor;

import org.bta.lesson.annotation.BtaNumber;

import java.lang.reflect.Field;

public class BtaNumberProcessor {
    public void process(Object objectToProcessor) throws Exception {
        final Class clazz = objectToProcessor.getClass();
        final Field[] fields = clazz.getDeclaredFields(); // это массив филдов
        for (Field field : fields) {
            field.setAccessible(true);
            if (!field.isAnnotationPresent(BtaNumber.class)){
                continue;
            }
            final BtaNumber annotation = field.getAnnotation(BtaNumber.class);
            final var max = annotation.max();
            final var min = annotation.min();
            Object rawValue = field.get(objectToProcessor);
            int value = (int) rawValue;
            if (value < min || value > max) {
                throw new RuntimeException("Invalid value....");
            }

        }
    }
}
