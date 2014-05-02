package iotsuite.semanticmodel;

public class Variable {

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

	/*
	 * public DataType getType() { return type; }
	 */
	public DataType getType() {
		return type;
	}

}
