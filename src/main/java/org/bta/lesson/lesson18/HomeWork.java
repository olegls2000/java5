package org.bta.lesson.lesson18;


//import processor.BtaStartWithProcessor;


import org.bta.lesson.lesson10.homework.Car;
import org.bta.lesson.model.specific.Director;
import org.bta.lesson.processor.BtaNumberProcessor;
import org.bta.lesson.processor.BtaProcessor;

import java.util.*;


public class HomeWork {
	public static void main(String[] args) throws Exception {
		final var director = new Director();
		director.setDepartment("Absolute");

		final var startWithProcessor = new BtaStartWithProcessor();
		final var numberProcessor = new BtaNumberProcessor();
		final var processors = new ArrayList<BtaProcessor>();
		processors.add((BtaProcessor) startWithProcessor);
		processors.add((BtaProcessor) numberProcessor);

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

	private static class BtaStartWithProcessor {
	}
}