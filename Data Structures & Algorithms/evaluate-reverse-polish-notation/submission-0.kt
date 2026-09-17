class Solution {
    fun evalRPN(tokens: Array<String>): Int {
         val stack = mutableListOf<Int>()
         for(token in tokens){
            when(token) {
                "+","-","*","/" -> {
                    val b = stack.removeAt(stack.lastIndex)
                    val a = stack.removeAt(stack.lastIndex)
                    val result = when(token) {
                        "+" -> a+b
                        "-" -> a-b
                        "*" -> a*b
                        else -> a/b
                    }
                    stack.add(result)
                } 
                else -> 
                    stack.add(token.toInt())
            }
         } 
         return stack.last()
    }
}
