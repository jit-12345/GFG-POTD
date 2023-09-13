//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int S = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.findLargest(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String findLargest(int N, int S){
        // code here
       
        StringBuilder str=new StringBuilder("");
         if(S==0 && N>1){
            str.append(-1);
            return str.toString();
        }
        
        while(N!=0){
            if(S>=9){
                str.append(9);
                S-=9;
                --N;
            }
            else{
                str.append(S);
                if(S!=0){
                    S=0;
                }
                --N;
            }
        }
        
        if(S!=0){
            str.delete(0,str.length());
             str.append(-1);
            return str.toString();
        }
        
        return str.toString();
    }
}