class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        List<String> versions1List = new ArrayList<>();
        List<String> versions2List = new ArrayList<>();
        Collections.addAll(versions1List, v1);
        Collections.addAll(versions2List, v2);
        while(versions1List.size() != versions2List.size()) {
            if(versions1List.size() > versions2List.size()) {
               versions2List.add("0");
            } else {
                versions1List.add("0");
            }
        }
        for(int i = 0; i < versions1List.size(); i++) {
            if(Integer.parseInt(versions1List.get(i)) > Integer.parseInt(versions2List.get(i))) return 1;
            else if(Integer.parseInt(versions1List.get(i)) < Integer.parseInt(versions2List.get(i))) return -1;
        }
        return 0;
    }
}
