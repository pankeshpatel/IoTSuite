package iotsuite.semanticmodel;

import java.util.HashSet;
import java.util.Set;

public class Widget {

	public Set<String> textboxs = new HashSet<String>();
	public Set<String> buttons = new HashSet<String>();
	public Set<String> textviews = new HashSet<String>();

	public Widget(String textbox, String button, String textview) {
		textboxs.add(textbox);
		buttons.add(button);
		textviews.add(textview);
	}

	public Set<String> getTextbox() {
		return textboxs;
	}

	public Set<String> getButton() {
		return buttons;
	}

	public Set<String> getTextview() {
		return textviews;
	}

}
