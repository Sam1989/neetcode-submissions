class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var map = HashMap<String, MutableList<String>>()
        for(str in strs) {
            val key = getFrequancyKey(str)
            map.getOrPut(key) { mutableListOf()}.add(str)
        }
        return map.values.toList()
    }

    fun getFrequancyKey(str: String): String {
        var count = IntArray(26)
        for(ch in str) {
            count[ch - 'a']++
        }
        return count.joinToString(",")
    }
}
