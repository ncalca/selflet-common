package it.polimi.elet.selflet.utilities;

import java.util.List;

import static junit.framework.Assert.*;

import org.junit.Test;

import com.google.common.collect.Lists;

public class CollectionUtilsTest {

	private static final int ITERATIONS = 10000;
	private static final double DELTA = 1e-2;

	@Test(expected = IllegalArgumentException.class)
	public void testWeightedRandomElementEmptyCollection() {
		List<IWeightedItem> list = Lists.newArrayList();
		CollectionUtils.weightedRandomElement(list);
	}

	@Test
	public void testWeightedRandomElementOneItem() {
		List<IWeightedItem> list = Lists.newArrayList();
		IWeightedItem item = createWeightedItem(1);
		list.add(item);
		IWeightedItem extracted = CollectionUtils.weightedRandomElement(list);
		assertEquals(item, extracted);
	}

	@Test
	public void testWeightedRandomElementTwoItems() {
		List<IWeightedItem> list = Lists.newArrayList();
		IWeightedItem item1 = createWeightedItem(1);
		IWeightedItem item2 = createWeightedItem(2);
		list.add(item1);
		list.add(item2);

		double item1extractions = 0;
		double item2extractions = 0;

		for (int i = 0; i < ITERATIONS; i++) {

			IWeightedItem extracted = CollectionUtils.weightedRandomElement(list);
			if (extracted == item1) {
				item1extractions++;
			}
			if (extracted == item2) {
				item2extractions++;
			}
		}

		assertEquals(item1extractions / ITERATIONS, 1.0 / 3, DELTA);
		assertEquals(item2extractions / ITERATIONS, 2.0 / 3, DELTA);

	}

	private IWeightedItem createWeightedItem(final int i) {
		return new IWeightedItem() {
			@Override
			public double weight() {
				return i;
			}
		};
	}

}
