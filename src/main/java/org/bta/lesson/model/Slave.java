package org.bta.lesson.model;

public class Slave extends AbstractWorker {
	public Slave(int salary, String firstName) {
		super(salary, firstName);
	}

	public Slave() {
		super.setFirstName("Joe");
		System.out.println("Slave constr");
	}

	@Override
	public String toString() {
		return "Slave{} " + super.toString();
	}
	private void someSecretMethod() {
		System.out.println("Heeelp me!!!");
	}
}
