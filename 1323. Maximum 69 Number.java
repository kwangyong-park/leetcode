class Solution {
    public int maximum69Number (int num) {
        String ns = String.valueOf(num);
        System.out.println(ns);
        boolean isChange = false; 
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ns.length(); i++) {
            System.out.println(i);
            
            if(ns.charAt(i) == '6' && isChange == false) {
                isChange = true;
                sb.append("9");
            } else {
                sb.append(ns.charAt(i));
            }
        }
        return Integer.valueOf(sb.toString());
    }
}
