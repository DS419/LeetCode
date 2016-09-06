import java.util.HashMap;
import java.util.Map;

/**
 * Created by LuoLiangchen on 16/9/6.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int other = target - nums[i];
            if (numMap.containsKey(other)) {
                return new int[] { numMap.get(other), i };
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
    }
}