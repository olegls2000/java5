package lesson18;

import model.Car;
import model.specific.Director;
import processor.BtaNumberProcessor;
import processor.BtaProcessor;
import processor.BtaStartWithProcessor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class HomeWork {

    public static void main(String[] args) throws Exception {
        Director director = new Director();
        director.setDepartment("Absolute");

        BtaProcessor startWithProcessor = new BtaStartWithProcessor();
        BtaProcessor numberProcessor = new BtaNumberProcessor();
        List<BtaProcessor> processors = new ArrayList<>();
        processors.add(startWithProcessor);
        processors.add(numberProcessor);

        fullProcessing(director, processors);
        fullProcessing(new Director(), processors);
        fullProcessing(null, processors);
        fullProcessing(new Car(99, 99), processors);

        //startWithProcessor.process(director);
        //numberProcessors.process(director)
    }
        private static void fullProcessing(Object o, Collection<BtaProcessor> processors) throws Exception {
            for (BtaProcessor processor : processors) {
                processor.process(o);
            }
        }
    }


