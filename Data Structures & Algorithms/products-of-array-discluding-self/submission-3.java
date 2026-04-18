class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int totalProd = 1;
        for(int n : nums){
            if(n == 0){
                zeroCount++;
            }
            else {
                totalProd *= n;
            }
        }
        if(zeroCount > 1){
            return new int[nums.length];
        }
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(zeroCount > 0){
                if(nums[i] == 0){
                    res[i] = totalProd;
                }else {
                    res[i] = 0;
                }
            }else {
                res[i] = totalProd / nums[i];
            }
        }
        return res; 
    }
}  
