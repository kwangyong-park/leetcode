class Solution {
    List<String> ans = new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {

        for(int i = 1; i <= 9; i++) {
            rec(n, String.valueOf(i), k);
        }

        return ans.stream().mapToInt(i -> Integer.valueOf(i)).toArray();
    }

    public void rec(int n, String cur, int k) {
        int length = cur.length();
        if(n == length) {
            ans.add(cur);
            return;
        }
        int last = Integer.valueOf(cur.charAt(length - 1) + "");
        for(int i = 0; i <= 9; i++) {
            if(Math.abs(i - last) == k) {
                rec(n, cur + i, k);
            }
        }

    }
}
