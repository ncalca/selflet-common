package it.polimi.elet.selflet.collectionUtils;

import static it.polimi.elet.selflet.collectionUtils.CollectionUtil.*;

import static junit.framework.Assert.*;

import java.util.Set;

import org.junit.Test;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;

public class CollectionUtilTest {

	private static final int ITERATION_LIMIT = 1000;

	@Test
	public void extractOneElementFromTest() {
		Multiset<Integer> occurrences = HashMultiset.create();
		Set<Integer> set = Sets.newHashSet(1, 2, 3, 4, 5);

		for (int i = 0; i < ITERATION_LIMIT; i++) {
			Integer element = extractOneElementFrom(set);
			occurrences.add(element);
			assertTrue(set.contains(element));
		}

		for (int i = 1; i <= 5; i++) {
			double occur = occurrences.count(i);
			assertEquals(0.2, occur / ITERATION_LIMIT, 0.05);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void extractOneElementFromEmptySet() {
		Set<Integer> set = Sets.newHashSet();
		extractOneElementFrom(set);
	}

	@Test
	public void extractAtMostNElementTest() {
		Set<Integer> set = Sets.newHashSet(1, 2, 3, 4, 5);
		for (int i = 1; i <= 5; i++) {
			Set<Integer> extracted = extractAtMostNElementsFromSet(set, i);
			assertEquals(i, extracted.size());
		}

		for (int i = 6; i <= 50; i++) {
			Set<Integer> extracted = extractAtMostNElementsFromSet(set, i);
			assertEquals(set.size(), extracted.size());
		}
	}

}
