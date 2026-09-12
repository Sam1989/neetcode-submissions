class Solution {
    fun trap(height: IntArray): Int {
        var totalWater = 0
        var left = 0
        var right = height.size - 1
        var leftMax = height[left]
        var rightMax = height[right]

        while(left < right){
            if(leftMax < rightMax) {
                left++
                leftMax = maxOf(leftMax, height[left])
                totalWater += leftMax - height[left]
            } else {
                right--
                rightMax = maxOf(rightMax, height[right])
                totalWater += rightMax - height[right]
            }
        }
        return totalWater
    }
}
