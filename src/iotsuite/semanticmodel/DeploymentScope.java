package iotsuite.semanticmodel;

public class DeploymentScope {

	private String softwareComponentName;
	private String attributeName;
	private String attributeValue;

	public DeploymentScope() {
	}

	public DeploymentScope(String softwareComponentName, String attributeName,
			String attributeValue) {
		super();
		this.softwareComponentName = softwareComponentName;
		this.attributeName = attributeName;
		this.attributeValue = attributeValue;

	}

	public String getSoftwareComponentName() {
		/*
		 * System.out.println("Software component name " + softwareComponentName
		 * + "  In deploymentscope.java ");
		 */
		return softwareComponentName;
	}

	public void setSoftwareComponentName(String softwareComponentName) {
		this.softwareComponentName = softwareComponentName;

	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeValue() {
		/*
		 * System.out.println("Attribute value is " + attributeValue +
		 * "  In deploymentscope.java ");
		 */
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

}
