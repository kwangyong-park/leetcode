class Solution {
  public int countCharacters(String[] words, String chars) {

    int result = 0;
    for(int i = 0; i < words.length; i ++) {
      int[] C = new int[52];
      char[] toChars = chars.toCharArray();

      for(int k = 0; k < toChars.length; k++) {
        int pivot = toChars[k] - 'a';
        C[pivot] = C[pivot]+1;
      }

      char[] toWord = words[i].toCharArray();
      for(int j = 0; j < toWord.length; j++) {
        int pivot = toWord[j] - 'a';
        if(C[pivot] <= 0) {
          break;
        }
        C[pivot]--;
        if(j == toWord.length-1) {
          result += toWord.length;
        }
      }
    }
    return result;
  }
}
