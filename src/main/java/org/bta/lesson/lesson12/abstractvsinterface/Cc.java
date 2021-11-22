package org.bta.lesson.lesson12.abstractvsinterface;

import java.util.AbstractList;
import java.util.AbstractSet;

public abstract class Cc extends AbstractSet
		/*, AbstractList*/ {
	private int someField;

	abstract void print();

	public void method1() {
		System.out.println("from Abstract");
	}
}
