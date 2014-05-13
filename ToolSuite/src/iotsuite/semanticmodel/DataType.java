package iotsuite.semanticmodel;

public class DataType {

	String name;
	String NEW_LINE;

	public DataType(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		NEW_LINE = System.getProperty("line.separator");

		result.append(name);

		return result.toString();
	}

}
