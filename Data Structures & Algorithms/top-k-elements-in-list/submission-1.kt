class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var map = HashMap<String, MutableList<String>>()
        for (s in strs) {
            var key = frequancy(s)
            map.getOrPut(key, {mutableListOf()}).add(s)
        }
        return map.values.toList()
    }

    fun frequancy(s: String): String {
        var count = IntArray(26)
        for(ch in s) {
            count[ch - 'a']++
        }
        return count.joinToString(",")
    }
}
