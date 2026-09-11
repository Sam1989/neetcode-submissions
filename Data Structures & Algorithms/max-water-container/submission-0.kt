class Solution {
    fun maxArea(heights: IntArray): Int {
        var left = 0
        var right = heights.size - 1
        var maxArea = 0
        while(left < right ) {
            var area = Math.min(heights[left], heights[right]) * (right - left)
            maxArea = Math.max(area, maxArea)
            if(heights[left] < heights[right]) {
                left++
            }else {
                right --
            }
        }
        return maxArea
    }
}

