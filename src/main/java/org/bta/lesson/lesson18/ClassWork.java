package org.bta.lesson.lesson18;


import org.bta.lesson.lesson10.Circle;
import org.bta.lesson.model.Point;
import org.bta.lesson.model.Slave;
import org.bta.lesson.processor.BtaNumberProcessor;
import org.bta.lesson.utils.BtaReflectionUtils;
import org.bta.lesson.utils.BtaUtils;


public class ClassWork {
	public static void main(String[] args) throws Exception {
		Slave bill = new Slave(20, "Bill");
		Slave joe = new Slave(800, "Joe");

		//joe.someSecretMethod();
		final var clazz = joe.getClass();
		final Class clazz1 = Slave.class;
		BtaUtils.printArray(clazz.getMethods());
		BtaUtils.printArray(clazz.getDeclaredMethods());
		BtaReflectionUtils.invokeMethod(bill, "secRet");
		BtaReflectionUtils.invokeMethod(joe, "sECRet");
		BtaReflectionUtils.invokeMethod(joe, "great");
		BtaReflectionUtils.invokeMethod(bill, "gREat");

		Circle circle = new Circle();
		BtaReflectionUtils.invokeMethod(circle, "sECRet");
		final var processor = new BtaNumberProcessor();
		Point point1 = new Point(2, 5);
		Point point2 = new Point(9999, 99999);
		processor.process(point1);
		processor.process(point2);
	}

}
