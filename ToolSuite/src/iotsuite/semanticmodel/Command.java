package iotsuite.semanticmodel;

import java.util.ArrayList;
import java.util.List;

public class Command {

	private String name;
	private Parameter parameters;
	private Widget widget;

	public Command(String name, Parameter parameters, Widget widget) {
		super();
		this.name = name;
		this.parameters = parameters;
		this.widget = widget;

	}

	public Widget getWidget() {
		return widget;
	}

	public void setWidget(Widget widget) {
		this.widget = widget;
	}

	public String getName() {
		return name;
	}

	public Parameter getParameters() {
		return parameters;
	}

	public List<Parameter> getAllParameter() {
		ArrayList<Parameter> allParameters = new ArrayList<Parameter>();
		allParameters.add(getParameters());
		return allParameters;
	}

	public boolean isParameter() {
		if (parameters != null)
			return true;
		else
			return false;
	}

}
