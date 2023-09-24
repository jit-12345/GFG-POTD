//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Integer.max(max,arr[i]);
        }
        
        int ar[]=new int[max+1];
        
        for(int i=0;i<arr.length;i++){
            ar[arr[i]]+=1;
        }
        
        for(int i=0;i<ar.length;i++){
            if(ar[i]>1){
                list.add(i);
            }
        }
        
        if(list.isEmpty()){
            list.add(-1);
            return list;
        }
        
        return list;
    }
}
