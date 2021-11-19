package org.bta.lesson.processor;

import org.bta.lesson.annotation.BtaNumber;
import org.bta.lesson.annotation.StartWith;

import java.lang.reflect.Field;
public class BtaStartWithProcessor implements BtaProcessor{
    public void process(Object objectToProcess) throws IllegalAccessException {

        final Class clazz = objectToProcess.getClass();
        final var fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            if (!field.isAnnotationPresent(StartWith.class)){
                continue;
            }

            final StartWith annotation = field.getAnnotation(StartWith.class);
            final var startChar = annotation.value();
            Object rawValue = field.get(objectToProcess);
            final var value = (String) rawValue;
            if(!value.startsWith(startChar)){
                throw new RuntimeException("Invalid value..."); //TODO krasivee
            }
        }
    }
}

