package iotsuite.semanticmodel;

public class DataAccess {

	private Information query;
	private Information generatedInfo;

	public DataAccess(Information query, Information generatedInfo) {
		super();
		this.query = query;
		this.generatedInfo = generatedInfo;
	}

	public Information getGeneratedInfo() {
		return generatedInfo;
	}

	public Information getQuery() {
		return query;
	}

	public String getDataAccessName() {
		return generatedInfo.getName();
	}

}
