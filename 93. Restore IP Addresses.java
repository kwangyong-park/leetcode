/**
* Unsuccessful Problom
*/
class Solution {
    public List<String> restoreIpAddresses(String s) {
      char[] chars = s.toCharArray();
      List<String> result = new ArrayList<>();
      bk(chars, "", -1, result);
      return result;
    }
  
    public void bk(char[] chars, String ip, int pivot, List<String> result) {
      if(pivot >= chars.length -1) {
        if(ipCheck(ip)) {
          result.add(ip);
        }
      }
      if(ip.split(".").length > 4) {
        return;
      }
      
      for(int i = pivot+1  ; i < chars.length; i++) {
         bk(chars, ip + chars[i] + ".", pivot+1, result);
      }
    }
  
    public boolean ipCheck(String val) {
      String[] split = val.split(".");
      if(split.length != 4) {
        return false;
      }
      for(String s: split) {
        int ip = Integer.valueOf(s);
        if(ip <= 0 || ip > 255) {
          return false;
        }
      }
      return true;
    }
}
