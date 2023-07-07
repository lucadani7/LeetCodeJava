package com.lucadani;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int elem : nums) {
            int frequency = frequencyMap.getOrDefault(elem, 0);
            frequencyMap.put(elem, frequency + 1);
        }
        frequencyMap.values().removeIf(frequency -> frequency > 1);
        return frequencyMap.keySet().iterator().next();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(solution.singleNumber(nums));
    }
}