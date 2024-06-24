class MyStack() {

    var point = 0
    var stack = IntArray(10000)

    fun push(x: Int) {
        stack[point++] = x
    }

    fun pop(): Int {
        return stack[--point]
    }

    fun top(): Int {
        return stack[point - 1]
    }

    fun empty(): Boolean {
        return point == 0
    }

}
