package org.bta.lesson.annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface StartWith {
    String value();
}
