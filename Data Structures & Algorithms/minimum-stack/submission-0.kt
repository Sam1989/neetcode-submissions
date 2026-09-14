class MinStack() {

    var stack = Stack<Int>()
    var minStack = Stack<Int>()

    fun push(value: Int) {
        stack.push(value)
        if(minStack.isEmpty() || value <= minStack.peek()){
            minStack.push(value)
        }
    }

    fun pop() {
        val popped = stack.pop()
        if(popped == minStack.peek()) {
            minStack.pop()
        }
    }

    fun top(): Int {
        return stack.pop()
    }

    fun getMin(): Int {
        return minStack.pop()
    }
}
