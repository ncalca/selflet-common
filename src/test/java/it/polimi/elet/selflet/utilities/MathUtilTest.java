package it.polimi.elet.selflet.utilities;

import org.junit.Test;

import static junit.framework.Assert.*;

public class MathUtilTest {

	private static final double DELTA = 1e-4;

	private double number;

	@Test
	public void testZeroOneBound() {

		number = MathUtil.limitNumber(0, 0, 1);
		assertEquals(0, number, DELTA);

		number = MathUtil.limitNumber(-1, 0, 1);
		assertEquals(0, number, DELTA);

		number = MathUtil.limitNumber(1, 0, 1);
		assertEquals(1, number, DELTA);

		number = MathUtil.limitNumber(1.1, 0, 1);
		assertEquals(1, number, DELTA);

		number = MathUtil.limitNumber(0.5, 0, 1);
		assertEquals(0.5, number, DELTA);
	}

	@Test
	public void testIsValidProbability() {
		assertTrue(MathUtil.isValidProbability(0));
		assertTrue(MathUtil.isValidProbability(1));
		assertTrue(MathUtil.isValidProbability(0.5));

		assertFalse(MathUtil.isValidProbability(-1));
		assertFalse(MathUtil.isValidProbability(1.1));
		assertFalse(MathUtil.isValidProbability(100));

	}

}
