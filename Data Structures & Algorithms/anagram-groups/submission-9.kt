class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var map = HashMap<String, MutableList<String>>()
        for(str in strs) {
            var key = frequancey(str)
            map.getOrPut(key, mutableList{}).add(str)
        }
        return map.value.toList()
    }
    fun frequancey(s: String): String {
        var count = IntArray(26)
        for(ch in s.length)
        {
            count[ch - 'a']++
        }
        return count.joinToString(",")
    }

}
