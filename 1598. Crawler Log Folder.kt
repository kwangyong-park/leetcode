class Solution {
    fun minOperations(logs: Array<String>): Int {
        var depth = 0
        for(log in logs) {
            if(log == "../") {
                if(depth > 0) {
                    depth--
                }
            } else if(log == "./") {

            } else {
                depth++
            }
        }
        return depth
    }
}
