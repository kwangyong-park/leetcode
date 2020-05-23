
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {

//    public static void main(String[] args) {
//        Solution s = new Solution();
//        s.intervalIntersection(new int[][]{{0,2},{5,10},{13,23},{24,25}}, new int[][]{{1,5},{8,12},{15,24},{25,26}});
//    }
    public int[][] intervalIntersection(int[][] A, int[][] B) {

        Stack<Pair<Integer, Integer>> sA = new Stack<>();
        Stack<Pair<Integer, Integer>> sB = new Stack<>();
        int iA = -1;
        int iB = -1;

        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        while(true) {
            if(sA.isEmpty() && ++iA < A.length) {
                sA.add(new Pair(A[iA][0], A[iA][1]));
            }
            if(sB.isEmpty() && ++iB < B.length) {
                sB.add(new Pair(B[iB][0], B[iB][1]));
            }
            if(sA.isEmpty() || sB.isEmpty()) break;

            Pair<Integer, Integer> a = sA.pop();
            Pair<Integer, Integer> b = sB.pop();

            Object[] union = getUnion(a, b);;
            Pair<Integer, Integer> p = (Pair<Integer, Integer>) union[0];
            if(union.length == 2) {
                pairs.add((Pair<Integer, Integer>) union[1]);
            }
            if(a == p) {
                sA.push(p);
            } else {
                sB.push(p);
            }
        }
        int[][] ret = new int[pairs.size()][];
        for(int i = 0 ; i < pairs.size(); i++) {
            ret[i] = new int[]{pairs.get(i).getKey(), pairs.get(i).getValue()};
        }
        return ret;
    }

    public Object[] getUnion(Pair<Integer, Integer> pairA, Pair<Integer, Integer> pairB) {
        Pair temp = null;
        if(pairA.getKey() > pairB.getKey()) {
            temp = pairA;
            pairA = pairB;
            pairB = temp;
        }

        if(pairA.getValue() >= pairB.getKey()) {
            return new Object[]{ pairB, new Pair(pairB.getKey(), Math.min(pairA.getValue(), pairB.getValue()))};
        }
        return  new Object[]{pairB};
    }

}
