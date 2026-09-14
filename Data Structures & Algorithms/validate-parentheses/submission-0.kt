class Solution {
    fun isValid(s: String): Boolean {
        var stack = Stack<Char>()

        for(c in s) {
            when(c) {
                '(' -> stack.push(')')
                '[' -> stack.push(']')
                '{' -> stack.push('}')
                else -> if (stack.removeLastOrNull() != c) {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}
