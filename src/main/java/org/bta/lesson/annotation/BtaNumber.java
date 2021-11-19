package org.bta.lesson.annotation;

import java.lang.annotation.*;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BtaNumber {
    int min();
    int max();
}


