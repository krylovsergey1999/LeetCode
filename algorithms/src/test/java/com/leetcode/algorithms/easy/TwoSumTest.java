package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoSumTest {
	@Test
	void twoSumTest1() {
		int[] in = new int[]{2, 7, 11, 15};
		var target = 9;
		int[] out = new int[]{0, 1};

		assertTrue(Arrays.equals(out, TwoSum.twoSum(in, target)));
	}

	@Test
	void twoSumTest2() {
		int[] in = new int[]{3, 2, 4};
		var target = 6;
		int[] out = new int[]{1, 2};

		assertTrue(Arrays.equals(out, TwoSum.twoSum(in, target)));
	}

	@Test
	void twoSumTest3() {
		int[] in = new int[]{3, 3};
		var target = 6;
		int[] out = new int[]{0, 1};

		assertTrue(Arrays.equals(out, TwoSum.twoSum(in, target)));
	}
}