
class MagicDictionary {

    /** Initialize your data structure here. */
    List<String> list;
    public MagicDictionary() {
        list = new ArrayList<>();
    }
    
    public void buildDict(String[] dictionary) {
        list.addAll(Arrays.asList(dictionary));
    }
    
    public boolean search(String searchWord) {

        for(String str : list) {
            if(str.length() == searchWord.length()) {
                int count = 0;
                check: for(int i = 0 ; i < str.length(); i++) {
                    if (str.charAt(i) != searchWord.charAt(i)) {
                        count++;
                        if(count >= 2) {
                            break check;
                        }
                    }
                }
                if(count == 1)
                    return true;
            }
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */
