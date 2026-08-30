class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = HashMap<Int, Int>()
        for(i in nums.indices) { 
            var diff = target - nums[i]
            if(map.containsKey(diff)) {
                return intArrayOf(map[diff]!!, i)
            } else {
                map[nums[i]] = i
            }
        }
        return intArrayOf()
     }
}
