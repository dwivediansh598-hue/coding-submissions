class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n=people.length;
        int i=0;int l=n-1;int boat=0;
        while(i<=l){
            if(people[i]+people[l]<=limit){
                i++;
            }
            
                l--;
                boat++;
            
        }
        return boat;
    }
}