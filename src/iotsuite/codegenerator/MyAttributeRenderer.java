package iotsuite.codegenerator;

import org.antlr.stringtemplate.AttributeRenderer;

public class MyAttributeRenderer implements AttributeRenderer {

	@Override
	public String toString(Object o) {
		return o.toString();
	}

	@Override
	public String toString(Object o, String formatName) {
		if (formatName.equals("capital")) {
			return capitalize(o.toString());
		} else

		if (formatName.equals("avoidCapital")) {
			return avoidCapital(o.toString());
		} else if (formatName.equals("toLower")) {
			return o.toString().toLowerCase();
		} else if (formatName.equals("singleLine")) {
			return singleLine(o.toString());
		} else if (formatName.equals("javadoc")) {
			return javadoc(o.toString());
		} else if (formatName.equals("javadocIndent")) {
			return javadocIndent(o.toString());
		} else if (formatName.equals("plural")) {
			return plural(o.toString());
		} else if (formatName.equals("pluralAvoidCapital")) {
			return plural(avoidCapital(o.toString()));
		} else if (formatName.equals("pluralCapital")) {
			return plural(capitalize(o.toString()));
		}
		return o.toString();
	}

	public String plural(String name) {
		if (name.endsWith("y") && !name.endsWith("way")) {
			return name.substring(0, name.length() - 1) + "ies";
		}
		return name + "s";
	}

	public String capitalize(String aString) {
		return "" + Character.toUpperCase(aString.charAt(0))
				+ aString.substring(1);
	}

	public String avoidCapital(String aString) {
		if (aString.length() == 0) {
			return aString;
		}
		char firstChar = aString.charAt(0);
		if (Character.isUpperCase(firstChar)) {
			return "" + Character.toLowerCase(firstChar) + aString.substring(1);
		}
		return aString;
	}

	public String singleLine(String str) {
		return str.replaceAll("(\n|\r|\t| )+", " ");
	}

	/**
	 * TODO: we must find a better way to format comment to javadoc
	 */
	public String javadoc(String str) {
		if (str == null || str.equals(""))
			return "";

		return str.replaceAll(System.getProperty("line.separator").toString(),
				"\n * ");
	}

	// TODO: find a proper way to deal with indentation in StringTemplate
	public String javadocIndent(String str) {
		if (str == null || str.equals(""))
			return "";

		return str.replaceAll(System.getProperty("line.separator").toString(),
				"\n     * ");
	}
}
