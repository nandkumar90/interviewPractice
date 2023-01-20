class IdentityDuplicateinaNumberArray {
    public boolean containsDuplicate(int[] nums) {
           HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();//Creating HashMap    
        boolean isRpeaturtionPresent = false;
        for(int x : nums){
          if( h.containsKey(x)){
             int exisitingvalue = h.get(x);
             if(exisitingvalue >=1 ){
             isRpeaturtionPresent = true;
             }
             h.put(x, exisitingvalue+1);
          }
          else {
              h.put(x, 1);
          }
        }
        return isRpeaturtionPresent;
    }
}
