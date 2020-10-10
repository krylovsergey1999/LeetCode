package com.leetcode.algorithms.easy;

import java.util.HashMap;

/**
 * Two Sum.
 *
 * @author Krylov Sergey (10.10.2020)
 * @see <a href="https://leetcode.com/problems/two-sum/">task</a>
 */
public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		var map = new HashMap<Integer, Integer>();
		for (var i = 0; i < nums.length; i++) {
			var val = map.computeIfAbsent(nums[i], x -> 0);
			map.put(nums[i], val + 1);
		}
		for (var i = 0; i < nums.length; i++) {
			var x = nums[i];
			var y = target - x;
			if (x == y) {
				if (map.get(y) > 1) {
					for (var j = i + 1; j < nums.length; j++) {
						if (nums[j] == y) {
							return new int[]{i, j};
						}
					}
				}
			} else
			if (map.containsKey(y)) {
				for (var j = i + 1; j < nums.length; j++) {
					if (nums[j] == y) {
						return new int[]{i, j};
					}
				}
			}
		}
		return result;
	}
}
