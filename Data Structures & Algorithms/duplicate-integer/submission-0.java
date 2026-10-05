class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int pointer=0;
        boolean found = false;

        while(found==false && (pointer<nums.length)){
            if(count.get(nums[pointer])==null){
                count.put(nums[pointer],1);
            } else{
                found=true;
            }
            pointer++;

        }
        return found;

    }
}