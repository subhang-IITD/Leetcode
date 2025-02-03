class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] list = new int[2];
        for(int i = 0; i < nums.length;i++){
            if(map.containsKey(nums[i])){
                list[0]= map.get(nums[i]);
                list[1] = i;
                // return new int[]{map.get(nums[i]),i};
            }else{
                map.put(target-nums[i],i);
            }
        }return list;
    }
}