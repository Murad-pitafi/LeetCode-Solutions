//java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++)
        {
            list.add(nums[i] * nums[i]); 
        }
      Collections.sort(list);
        for (int i = 0; i < nums.length; i++)
        {
           nums [i] = list.get(i);
        }
        return nums;
    }
}