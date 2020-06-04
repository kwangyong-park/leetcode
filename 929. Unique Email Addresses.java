    class Solution {
        public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();
        for(String email : emails) {
            String local = email.substring(0, email.indexOf("@"));
            String domain = email.substring(local.length(), email.length());
            if(local.indexOf("+") >= 0) {
                local = local.substring(0, local.indexOf("+"));
            }
            local = local.replaceAll("\\.", "");

            set.add(local + domain);

        }
        return set.size();
        }
    }
