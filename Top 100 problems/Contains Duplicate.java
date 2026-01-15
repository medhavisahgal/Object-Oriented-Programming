import java.util.HashSet;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Brute force
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        // int x=nums[i];
        // for(int j=i+1;j<n;j++){
        // if(x==nums[j]){
        // return true;
        // }
        // }
        // It will show tle as time complexity is O(n^2);
        // Optimised approach
        // we can sort
        // Arrays.sort(nums);
        // for(int i=1;i<n;i++){
        // if(nums[i-1]==nums[i]){
        // return true;
        // }
        // }
        // return false;
        // Time Complexity is O(nlogn)
        // More optimized approach is using hashset in terms of time complexity
        HashSet<Integer> s = new HashSet<>();
        for (int x : nums) {
            if (s.contains(x)) {
                return true;
            }
            s.add(x);
        }
        return false;
    }
}