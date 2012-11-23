package it.polimi.elet.selflet.collectionUtils;

import java.util.List;
import java.util.Set;

import org.apache.commons.math.random.RandomData;
import org.apache.commons.math.random.RandomDataImpl;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * Various utilities for collections
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class CollectionUtil {

	private CollectionUtil() {
		// private constructor
	}

	private static final RandomData RANDOM_DATA = new RandomDataImpl();

	/**
	 * Returns a subset of at most n elements randomly extracted from the set
	 * given as input. If the size of the input set is less or equal to n
	 * returns a copy of the whole set.
	 * 
	 * @throws IllegalArgumentException
	 *             if n<=0
	 * */
	public static <T> Set<T> extractAtMostNElementsFromSet(Set<T> set, int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("N must be positive");
		}

		if (set.size() <= n) {
			return Sets.newHashSet(set);
		}

		// we have a set with size > than n

		Set<T> returnSet = Sets.newHashSet();
		Set<T> processedSet = Sets.newHashSet(set);

		for (int i = 0; i < n; i++) {
			T element = extractOneElementFrom(processedSet);
			returnSet.add(element);
			processedSet.remove(element);
		}

		return returnSet;
	}

	public static <T> T extractOneElementFrom(Set<T> set) {
		if (set.isEmpty()) {
			throw new IllegalArgumentException("The set is empty");
		}
		// TODO maybe not very efficient, it creates a copy of the set!
		List<T> list = Lists.newArrayList(set);
		int elementIndex = RANDOM_DATA.nextInt(0, list.size() - 1);
		return list.get(elementIndex);
	}
}
