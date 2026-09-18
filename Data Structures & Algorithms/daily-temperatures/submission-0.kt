class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        var stack = Stack<Int>()
        var n = temperatures.size
        var res = IntArray(n)
        
        for (i in n - 1 downTo 0) {
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop()
            }

            if(!stack.isEmpty()) {
                res[i] = stack.peek() - i
            }

            stack.push(i)
        }
        return res
    }
}
