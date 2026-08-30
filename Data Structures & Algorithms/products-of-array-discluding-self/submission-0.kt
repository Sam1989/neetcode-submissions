class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var n = nums.size
        var left = IntArray(n)
        var right = IntArray(n)
        var result = IntArray(n)
        left[0] = 1
        right[n - 1] = 1

        for(i in 1 until n){
            left[i] = left[i-1] * nums[i-1]
        }

        for(i in n - 2 downTo 0){
            right[i] = right[i+1] * nums[i+1]
        }

        for(i in 0 until n) {
            result[i] = left[i] * right[i]
        }
        return result
    }
}
