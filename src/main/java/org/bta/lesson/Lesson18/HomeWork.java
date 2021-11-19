package org.bta.lesson.Lesson18;

import org.bta.lesson.annotation.StartWith;
import org.bta.lesson.model.Director;
import org.bta.lesson.processor.BtaNumberProcessor;
import org.bta.lesson.processor.BtaProcessor;
import org.bta.lesson.processor.BtaStartWithProcessor;

import java.util.ArrayList;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) throws Exception {
        Director director = new Director();
        director.setDepartment("Absolute");

        BtaProcessor startWithProcessor = new BtaStartWithProcessor();
        BtaNumberProcessor numberProcessor = new BtaNumberProcessor();
        List<BtaProcessor> processors = new ArrayList<>();
        startWithProcessor.process(director);

    }
}
