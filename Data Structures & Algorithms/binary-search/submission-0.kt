class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var low = 1
        var high = nums.size

        while(low <= high){
            var mid  = (low + high) / 2
            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> low = mid + 1
                else ->  high = mid - 1
            }     
        }
        return -1
    }
}
