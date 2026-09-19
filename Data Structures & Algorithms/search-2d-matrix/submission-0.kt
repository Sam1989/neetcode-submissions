class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var top = 0
        var bottom = matrix.size - 1 
        while (top <= bottom) {
            val row  = top + (bottom - top) / 2
            when {
                target < matrix[row].first() -> bottom = row - 1
                target > matrix[row].last() -> top = row + 1
                else -> {
                    var low = 0
                    var high = matrix[row].size - 1
                    while(low <= high) {
                         val mid = low + (high - low) / 2
                         when {
                            matrix[row][mid] == target -> return true
                            matrix[row][mid] < target  -> low = mid + 1
                            matrix[row][mid] > target -> high = mid - 1
                         }
                    }
                    return false
                }
            }
        }
        return false
    }
}
