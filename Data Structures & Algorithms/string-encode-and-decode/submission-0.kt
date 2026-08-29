class Solution {

    fun encode(strs: List<String>): String {
        var str = ""
        for (s in strs){
            str+= "${s.length}#$s"
        }
        return str
    }

    fun decode(str: String): List<String> {
        var res = mutableListOf<String>()
        var i = 0
        while(i < str.length){
            var j = i
            while (str[j] != '#') {
                j++
            }
            var len = str.substring(i ,j).toInt()
            var newCharLen = j + 1 + len
            res.add(str.substring(j + 1, newCharLen))
            i  = newCharLen
        }
        return res
    }
}
