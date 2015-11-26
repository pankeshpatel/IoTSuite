package iotsuite.semanticmodel;

public class Variable {

	// static String name;
	String name;
	DataType type;

	public Variable(String name, DataType type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getType() {

		return type.getfieldType();
	}

	/*
	 * public DataType getType() { return type; }
	 */
	/*
	 * public DataType getType() { return type; }
	 */
}
