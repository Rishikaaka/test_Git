class Solution {
    public int[] twoSum(int[] nums, int target) {  
        int i,j;
        int temp=target;
        for( i=0;i<nums.length-1;i++)
        {
            for( j=i+1;j<nums.length;j++)
            {
                target= nums[i]+nums[j];
                if(temp == target){
                    return new int[] {i,j};
                }
            }
        }
         return new int[] {i};
    }
}
