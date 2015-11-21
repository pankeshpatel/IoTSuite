package iotsuite.semanticmodel;

public class DeploymentScope {

	private String softwareComponentName;
	private String softwareComponentType;

	public DeploymentScope() {
	}

	public DeploymentScope(String softwareComponentName,
			String softwareComponentType) {
		this.softwareComponentName = softwareComponentName;
		this.softwareComponentType = softwareComponentType;
	}

	public String getSoftwareComponentType() {
		return softwareComponentType;
	}

	public void setSoftwareComponentType(String softwareComponentType) {
		this.softwareComponentType = softwareComponentType;
	}

	public String getSoftwareComponentName() {
		return softwareComponentName;
	}

	public void setSoftwareComponentName(String softwareComponentName) {
		this.softwareComponentName = softwareComponentName;
	}

}
