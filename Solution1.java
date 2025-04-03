class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length,i;
        long maxi=0;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        prefix[0]=nums[0];
        suffix[n-1]=nums[n-1];
        for(i=1;i<n;i++)
            prefix[i]=Math.max(prefix[i-1],nums[i]);
        for(i=n-2;i>=0;i--)
            suffix[i]=Math.max(suffix[i+1],nums[i]);
        for(i=1;i<n-1;i++)
            maxi=Math.max(maxi,(long)(prefix[i-1]-nums[i])*suffix[i+1]);
        return maxi;
    }
}