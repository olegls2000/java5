package org.bta.lesson.processor;


import org.bta.lesson.annotation.BtaNumber;

import java.lang.reflect.Field;

public class BtaNumberProcessor implements BtaProcessor {
	@Override
	public void process(Object objectToProcess) throws Exception {
		final Class clazz = objectToProcess.getClass();
		final Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			if (!field.isAnnotationPresent(BtaNumber.class)) {
				continue;
			}
			final BtaNumber annotation = field.getAnnotation(BtaNumber.class);
			final var max = annotation.max();
			final var min = annotation.min();
			Object rawValue = field.get(objectToProcess);
			int value = (int) rawValue;
			if (value < min || value > max) {
				throw new RuntimeException("Invalid value...");
			}
		}
		System.out.println("Object is valid");
	}
}

