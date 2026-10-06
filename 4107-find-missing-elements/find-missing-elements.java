class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int r = 0;
        while(r<nums.length-1){
            int cur = nums[r];
            while(cur+1 < nums[r+1]){
                cur++;  
                res.add(cur);
                              
            }    
            r++;                                             
        }
        return res;
    }
}