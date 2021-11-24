package org.bta.lesson.processor;

import org.bta.lesson.annotation.StartWith;

import java.lang.reflect.Field;

public class StartWithProcessor {

    public void process(Object objectToProcess) throws Exception {

        long startTime = System.currentTimeMillis();

        final Class clazz = objectToProcess.getClass();
        var fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);

// ???
     //       if (!field.isAnnotationPresent(StartWith.class) && (field.getType(StartWith.class) == ) ) {
      //          continue;
     //       }
            final StartWith annotation = field.getAnnotation(StartWith.class);


            final var character = annotation.startElement();
//??
            Object rawValue = field.get(objectToProcess);
            char value = (char) rawValue;
            if (value != character) {
                throw new RuntimeException(" ...");
            }
        }

        long endTime = System.currentTimeMillis();
        long processTime = endTime - startTime;
        System.out.println( " Elapsed time in ms : " + processTime);



    }
    private  static void check() {


    }
}
