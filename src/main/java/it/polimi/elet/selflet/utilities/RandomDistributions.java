package it.polimi.elet.selflet.utilities;

import org.apache.commons.math.random.RandomData;
import org.apache.commons.math.random.RandomDataImpl;

/**
 * Class offering numbers extracted from various random distributions
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class RandomDistributions {

	private static final RandomData RANDOM_DATA = new RandomDataImpl();

	private RandomDistributions() {
		// private constructor
	}

	public static double randExponential(double mean) {
		return RANDOM_DATA.nextExponential(mean);
	}

	public static double randUniform() {
		return RANDOM_DATA.nextUniform(0, 1);
	}

}
