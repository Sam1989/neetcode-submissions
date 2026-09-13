class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var set = HashSet<Char>()
        var maxLength = 0
        var left = 0
        for(right in 0 until s.length) {
            while(set.contains(s[right])){
                set.remove(s[left])
                left++
            }    
            set.add(s[right])
            maxLength = maxOf(maxLength, right - left + 1)
        }
        return maxLength
    }
}
