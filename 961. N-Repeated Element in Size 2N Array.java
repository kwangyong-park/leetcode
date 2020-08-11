public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        for (int k: map.keySet())
            if (map.get(k) > 1)
                return k;
        return -1;
    }
