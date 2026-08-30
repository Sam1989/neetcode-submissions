class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var map = HashMap<Int, Int >()
        for(i in nums.indices){
            if(map.containsKey(nums[i])){
                return true
            } else {
                map[nums[i]] = nums[i]
            }
        }
        return false
    }
}
