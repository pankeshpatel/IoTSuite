package iotsuite.semanticmodel;

public class DeploymentScope {

	private String softwareComponentName;
	private String softwareComponentType;

<<<<<<< HEAD
	public DeploymentScope() {
	}

	public DeploymentScope(String softwareComponentName,
			String softwareComponentType) {
		this.softwareComponentName = softwareComponentName;
		this.softwareComponentType = softwareComponentType;
	}

=======
	
	public DeploymentScope() {
	}
	
	public DeploymentScope(String softwareComponentName, String softwareComponentType) {
		this.softwareComponentName = softwareComponentName;
		this.softwareComponentType = softwareComponentType;
	}
	
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
	public String getSoftwareComponentType() {
		return softwareComponentType;
	}

	public void setSoftwareComponentType(String softwareComponentType) {
		this.softwareComponentType = softwareComponentType;
	}
<<<<<<< HEAD

=======
	
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
	public String getSoftwareComponentName() {
		return softwareComponentName;
	}

	public void setSoftwareComponentName(String softwareComponentName) {
		this.softwareComponentName = softwareComponentName;
	}

}
