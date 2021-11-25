package org.bta.lesson.lesson18;




import org.bta.lesson.model.Car;
import org.bta.lesson.model.specific.Director;
import org.bta.lesson.processor.BtaNumberProcessor;
import org.bta.lesson.processor.BtaProcessor;
import org.bta.lesson.processor.BtaStartWithProcessor;

import java.util.*;


public class HomeWork {
    public static void main(String[] args) throws Exception {
        final Director director = new Director();
        director.setDepartment("Absolute");

        final BtaStartWithProcessor startWithProcessor = new BtaStartWithProcessor();
        final BtaNumberProcessor numberProcessor = new BtaNumberProcessor();
        final ArrayList<BtaProcessor> processors = new ArrayList<BtaProcessor>();
        processors.add(startWithProcessor);
        processors.add(numberProcessor);

        fullProcessing(director, processors);
        fullProcessing(new Director(), processors);
        fullProcessing(null, processors);
        fullProcessing(new Car(99, 99), processors);
    }

    private static void fullProcessing(Object o, Collection<BtaProcessor> processors) throws Exception {
        for (BtaProcessor processor : processors) {
            processor.process(o);
        }
    }
}