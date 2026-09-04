class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val row = HashMap<Int, MutableSet<Char>>()
        val col = HashMap<Int, MutableSet<Char>>()
        val squre = HashMap<Pair<Int, Int>, MutableSet<Char>>()
        for(r in 0 until 9){
            for(c in 0 until 9){
                var ch = board[r][c]
                if(ch == '.') continue

                val key = r/3 to c/3
                if (ch in row.getOrPut(r) { mutableSetOf() } || 
                    ch in col.getOrPut(c) { mutableSetOf() } ||
                    ch in squre.getOrPut(key) { mutableSetOf() }
                ) return false


                row.getValue(r).add(ch)
                col.getValue(c).add(ch)
                squre.getValue(key).add(ch)
            }
        }
        return true
    }
}
