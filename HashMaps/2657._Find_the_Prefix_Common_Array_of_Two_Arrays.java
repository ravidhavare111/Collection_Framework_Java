 // https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/description/

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int n = A.length;
        int count = 0;
        HashMap<Integer, Integer> HM = new HashMap<>();
        int ans[] = new int[n];
        
        
        for(int i = 0 ; i < n ; i++){
            if(A[i] == B[i]){
                count++;
            }
            
            if(HM.containsKey(A[i])){
                count++;
            }
            if(HM.containsKey(B[i])){
                count++;
            }
            
            ans[i] = count;
            
            HM.put(A[i], HM.getOrDefault( A[i], 0) + 1);
            HM.put(B[i], HM.getOrDefault( B[i], 0) + 1);
        }
        
        return ans;
        
    }
}
