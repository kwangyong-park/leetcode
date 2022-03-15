class Solution {
    public int minOperations(String[] logs) {
        int deepth = 0;
        for(String log : logs) {
            if(log.startsWith("../")) {
                if(deepth > 0) {
                    deepth--;
                }
            } else if(log.startsWith("./")) {
                
            } else {
                deepth++;
            }
        }
        return deepth;
    }
}
