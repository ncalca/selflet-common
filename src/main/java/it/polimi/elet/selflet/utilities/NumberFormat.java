package it.polimi.elet.selflet.utilities;

import java.text.DecimalFormat;

/**
 * Utility class used to format numbers in a specific decimal format
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class NumberFormat {

	private NumberFormat() {
		// private constructor
	}

	private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("##.###");

	public static String formatNumber(double number) {
		return DECIMAL_FORMAT.format(number);
	}

	public static String toStr(long number) {
		return DECIMAL_FORMAT.format(number);
	}

}
