class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < m; i++)
        {
            list.add(nums1[i]);
        
            
            
        }
        for (int i = 0; i < nums2.length; i++)
        {
            
            list.add(nums2[i]);
        }
       Collections.sort(list); 
    for (int i = 0; i < nums1.length; i++)
    {
        nums1[i] = list.get(i);
    }
    }
    
    
}