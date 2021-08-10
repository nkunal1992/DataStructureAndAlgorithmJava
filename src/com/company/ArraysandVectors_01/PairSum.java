/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */

package com.company.ArraysandVectors_01;

import java.util.HashMap;

public class PairSum {
    public static int[] twoSum(int[] nums, int target) {
        int [] res = new int [2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;

        for(int num : nums){
            map.put(num, idx);
            idx++;
        }

        for(int i=0; i<nums.length; i++) {

            if(map.containsKey(target-nums[i])){
                int id = map.get(target-nums[i]);
                if(id != i){
                    res[0] = i;
                    res[1] = id;
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        int [] res = twoSum(nums, 6);
        System.out.println(res[0] + " " + res[1]);
    }
}
