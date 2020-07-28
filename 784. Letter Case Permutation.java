class Solution {
  public List<String> letterCasePermutation(String S) {
        Set<String> result = new HashSet<>();
        result.add(S);
        result.add(S.toLowerCase());

        for(int i = 0 ; i < S.length(); i++) {
            if(Character.isLowerCase(S.charAt(i))) {
                result.add(S.substring(0, i) + Character.toUpperCase(S.charAt(i)) + S.substring(i+1));
            } else {
                result.add(S.substring(0, i) + Character.toLowerCase(S.charAt(i)) + S.substring(i+1));
            }
        }
        result.add(S.toUpperCase());
        List<String> sort = result.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return sort;
    }
}
