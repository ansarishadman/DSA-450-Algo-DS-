import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] pairValue = twoSum(nums, target);
        System.out.println(Arrays.toString(pairValue));
    }

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] pairValue = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                pairValue[1] = i;
                pairValue[0] = map.get(target - nums[i]);
            }
            map.put(nums[i], i);
        }
        return pairValue;
    }
}
