package it.polimi.elet.selflet.utilities;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * A collection of small math utilities
 * 
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class MathUtil {

	private MathUtil() {
		// private constructor
	}

	/**
	 * Returns true if the number represent a valid probability (i.e. in [0,1])
	 * */
	public static boolean isValidProbability(double number) {
		return isInRangeInclusive(number, 0d, 1d);
	}

	/**
	 * Returns true if the given number is within the range [min,max]
	 * */
	public static boolean isInRangeInclusive(double number, double min, double max) {
		return (number >= min && number <= max);
	}

	/**
	 * Limits a number within a given range
	 * 
	 * if min <= number <= number then number
	 * 
	 * if number <= min then min
	 * 
	 * if number >= max the max
	 * */
	public static double limitNumber(double number, double min, double max) {
		return min(max(min, number), max);
	}
}
