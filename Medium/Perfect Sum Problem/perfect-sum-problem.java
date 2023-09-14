//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	    
	  int dp[][]=new int[arr.length+1][sum+1];
	  
	  for(int i=0;i<dp.length;i++){
	      dp[i][0]=1;
	  }
	  for(int i=1;i<dp[0].length;i++){
	      dp[0][i]=0;
	  }
	  
	  
	  for(int i=1;i<dp.length;i++){
	      for(int j=0;j<dp[0].length;j++){
	          if(arr[i-1]<=j){
	              dp[i][j]=(int)(dp[i-1][j-arr[i-1]]+dp[i-1][j])%(int)(Math.pow(10,9)+7);
	          }
	          else{
	              dp[i][j]=(int)(dp[i-1][j])%(int)(Math.pow(10,9)+7);
	          }
	      }
	  }
	  
	  return dp[arr.length][sum];
	  
	} 
}