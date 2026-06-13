class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res=new int[nums.length];
        int posidx=0;
        int negidx=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0){
                res[posidx]=nums[i];
                posidx+=2;
            }
            if(nums[i]<0)
            {
                res[negidx]=nums[i];
                negidx+=2;
            }
        }
        return res;
    }
}