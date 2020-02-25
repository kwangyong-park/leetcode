/**
* Unsuccessful Problom
*/
class Solution {
  public boolean isPossible(int[] nums) {
    if(nums.length == 1){
      return false;
    }
    return gd(nums, 1);

  }

  public boolean gd(int[] nums, int pivot) {

    for(int i = pivot ; i < nums.length; i++) {
      if(nums[i] > nums[i -1]) {

      }else if(nums[i] == nums[i -1] && i- pivot  >=2 ){
        if(!gd(nums, i+1)) {
          return false;
        } else {
          return true;
        }
      } else {
        return false;
      }
    }
    return true;
  }

}
