package it.polimi.elet.selflet.utilities;

/**
 * Utility to convert a string to its referenced type
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class StringToClassConversion {

	private StringToClassConversion() {
		// private constructor
	}

	public static Class<?> convert(String typeName) {

		if (typeName.equalsIgnoreCase("String")) {
			return String.class;
		}

		if (typeName.equalsIgnoreCase("Integer")) {
			return Integer.class;
		}

		if (typeName.equalsIgnoreCase("Double")) {
			return Double.class;
		}

		if (typeName.equalsIgnoreCase("Object")) {
			return Object.class;
		}

		throw new IllegalArgumentException("Wrong type " + typeName);
	}
}
