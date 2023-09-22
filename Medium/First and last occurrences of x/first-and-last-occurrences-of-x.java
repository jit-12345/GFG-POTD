//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    static int bin_search(int si, int ei, int key, int arr[]) {
        if (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                return bin_search(mid + 1, ei, key, arr);
            } else {
                return bin_search(si, mid - 1, key, arr);
            }
        }
        return -1;
    }

    ArrayList find(int arr[], int n, int x) {
        ArrayList al = new ArrayList<>();
        if (bin_search(0, n - 1, x, arr) == -1) {
            al.add(-1);
            al.add(-1);
        } else {
            int si, ei;
            si = ei = bin_search(0, n - 1, x, arr);

            while (bin_search(0, si - 1, x, arr) != -1) {
                si = bin_search(0, si - 1, x, arr);
            }
            while(bin_search(ei+1,n-1,x,arr)!=-1){
                ei=bin_search(ei+1,n-1,x,arr);
            }
            
            al.add(si);
            al.add(ei);
        }
        
        return al;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Integer> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends