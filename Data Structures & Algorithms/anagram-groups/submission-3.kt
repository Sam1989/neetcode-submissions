class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var map = HashMapM<String, mutableList<Int, Int>>()
        for(i in strs.lenght()) {
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
