class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var map = HashMap<String, MutableList<String>>()
        for(i in strs.length) {
            var key = frequancey(strs[i])
            map.getOrPut(key, mutableList{}).add(strs[i])
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
