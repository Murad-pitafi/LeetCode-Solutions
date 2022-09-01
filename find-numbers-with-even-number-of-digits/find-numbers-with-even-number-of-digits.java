class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        int a=0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
             c = 0;
            while(nums[i] != 0)
            {
                sum = nums[i]/10;
                c++;
                System.out.println(sum);
                nums[i]= sum;
                
            }
            if(c%2 == 0)
            {
               
                a++;
            }
        }
        
        return a;
    }
}