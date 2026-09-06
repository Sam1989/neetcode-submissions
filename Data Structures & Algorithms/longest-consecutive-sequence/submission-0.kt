class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        var longestLength = 0
        var map = HashMap<Int, Boolean>()

        for(num in nums) {
            map[num] = false
        }

        for(num in nums) {
            var currentLenght = 1
            
            var nextNum = num + 1
            while(map.containsKey(nextNum) && map[nextNum] == false){
                currentLenght++
                map[num] = true
                nextNum++
            }

            var preNum = num - 1
            while(map.containsKey(preNum) && !map[preNum]!!){
                currentLenght++
                map[num] = true
                preNum --
            }
            longestLength = Math.max(longestLength, currentLenght)
        }

        return longestLength
    }
}
