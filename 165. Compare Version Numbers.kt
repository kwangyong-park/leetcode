class Solution {
    fun compareVersion(version1: String, version2: String): Int {
        val split1 = version1.split(".")
        val split2 = version2.split(".")
        for(i in 0 until maxOf(split1.size, split2.size)) {
            val curVersion1 = if(i > split1.size - 1) "0" else split1[i]
            val curVersion2 = if(i > split2.size - 1) "0" else split2[i]

            if(curVersion1.toInt() < curVersion2.toInt()) {
                return -1
            } else if(curVersion1.toInt() > curVersion2.toInt()) {
                return 1
            } else {
                continue
            }
        }
        return 0
    }
}
