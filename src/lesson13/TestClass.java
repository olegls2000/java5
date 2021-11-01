package lesson13;

public class TestClass {
	private int count;
	private String name;


	public TestClass(int count, String name) {
		this.count = count;
		this.name = name;
	}

	@Override
	public int hashCode() {
		int result = count;
		result = 31 * result + name.hashCode();
		return result;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof TestClass)) {
			return false;
		}
		TestClass custObject = (TestClass) obj;
		return count == custObject.count
				&& name.equals(custObject.name);
	}
}

