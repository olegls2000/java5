package lesson18;

import model.Car;
import model.specific.Director;
import processor.BtaNumberProcessor;
import processor.BtaProcessor;
import processor.BtaStartWithProcessor;


import java.util.*;


public class HomeWork {
    public static void main(String[] args) throws Exception {
        final var director = new Director();
        director.setDepartment("Absolute");

        final var startWithProcessor = new BtaStartWithProcessor();
        final var numberProcessor = new BtaNumberProcessor();
        final var processors = new ArrayList<BtaProcessor>();
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