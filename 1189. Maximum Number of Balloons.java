class Solution {
  public int maxNumberOfBalloons(String text) {
    char[] arrays = text.toCharArray();
    int[] words = new int[1000];
    for(char c: arrays) {
      words[c]++;
    }

    return Math.min(Math.min(Math.min(Math.min(words['b'], words['a']), words['l']/2), words['o']/2), words['n']);
  }
}
