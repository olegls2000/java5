package org.bta.lesson.lesson12.abstractvsinterface;

import java.io.Serializable;
import java.util.concurrent.Callable;

//interface moget nasledovat mnogestvo drugih interfeisov
public interface Ii extends
        Serializable,
        Runnable,
        Callable {
    int SOME_FIELD = 7;  // tolko konstanta
    void  print();
    //tolko defoltnaja!!!   implementacija
    default void method1(){
        System.out.println(" from Abstract");
    }

}
