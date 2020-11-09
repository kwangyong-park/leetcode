class Solution {
    public String[] findOcurrences(String text, String first, String second) {

        String[] split = text.split(" ");
        List<String> ret = new ArrayList<>();
        for(int i = 1; i < split.length - 1; i++) {
            if(split[i - 1].equals(first) && split[i ].equals(second)) {
                ret.add(split[i + 1]);
            }
        }

        return ret.stream().toArray(String[]::new);
    }
}
