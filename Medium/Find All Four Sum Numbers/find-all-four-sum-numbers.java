//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        HashSet<ArrayList<Integer>> h=new HashSet<>();
        int n=arr.length;
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int s=j+1;
                int e=n-1;
                while(s<e){
                    int sum=arr[i]+arr[j]+arr[s]+arr[e];
                    if(sum==k){
                        ArrayList<Integer>l=new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[s],arr[e]));
                        if(!h.contains(l)){
                            list.add(l);
                            h.add(l);
                        }
                        s++;
                        e--;
                        
                       
                    }
                     else if(sum<k) s++;
                        else e--;
                }
            }
        }
        
        return list;
            
    }
}