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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PairSum {
    public static ArrayList<Integer> twoSum(int[] nums, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            int x = target - nums[i];
            if(!set.contains(x)){
                set.add(nums[i]);
            } else {
                res.add(nums[i]);
                res.add(x);
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {9,-6,1,2,10};
        ArrayList<Integer> res = twoSum(nums, 4);
        if(res.size() == 0){
            System.out.println("No such pair exists");
        } else {
            System.out.println(res.get(0) + " " + res.get(1));
        }
    }
}
