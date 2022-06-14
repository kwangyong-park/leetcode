class Solution {
  public int largestInteger(int num) {
        String str = String.valueOf(num);
        List<Character> odd = new ArrayList<>();
        List<Character> even = new ArrayList<>();
        List<Boolean> isEven = new ArrayList<>();
        for(int i = 0 ; i < str.length() ;i++) {
            int val = Integer.valueOf(str.charAt(i));
            if(val%2 == 0) {
                even.add(str.charAt(i));
                isEven.add(true);
            } else {
                odd.add(str.charAt(i));
                isEven.add(false);
            }
        }
        Collections.sort(odd, (a, b) -> b -a);
        Collections.sort(even, (a, b) -> b -a);
        String ans = "";
        int k = 0, j = 0;
        for(int i = 0; i < isEven.size(); i++) {
            if(isEven.get(i)) {
                ans+=even.get(k++);
            }else {
                ans+=odd.get(j++);
            }
        }

        return Integer.valueOf(ans);
    }
}
