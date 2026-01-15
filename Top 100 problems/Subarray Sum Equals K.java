import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        // Brute Force Approach
        // int n=nums.length;
        // int cnt=0;
        // for(int i=0;i<n;i++){
        // for(int j=i;j<n;j++){
        // int sum=0;
        // for(int l=i;l<=j;l++){
        // sum+=nums[l];
        // }
        // if(sum==k){
        // cnt++;
        // }
        // }
        // }
        // It will show tle as Time Complexity is O(n^3)
        // Optimized Approach
        // Using prefix sum and hashing
        HashMap<Integer, Integer> preSumCnt = new HashMap<>();
        int currsum = 0;
        int totsub = 0;
        preSumCnt.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            currsum += nums[i];
            int reqsum = currsum - k;
            if (preSumCnt.containsKey(reqsum)) {
                totsub += preSumCnt.get(reqsum);
            }
            if (preSumCnt.containsKey(currsum)) {
                int oldcnt = preSumCnt.get(currsum);
                preSumCnt.put(currsum, oldcnt + 1);
            } else {
                preSumCnt.put(currsum, 1);
            }
        }
        return totsub;
    }
}