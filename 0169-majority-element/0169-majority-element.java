import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for(int num : set) {

            int count = 0;

            for(int i = 0; i < nums.length; i++) {

                if(nums[i] == num) {
                    count++;
                }
            }

            if(count > nums.length / 2) {
                return num;
            }
        }

        return -1;
    }
}