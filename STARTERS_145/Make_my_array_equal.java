//Make My Array Equal
//You are given an array A of length N
//Determine if it is possible to make all the elements of A equal by performing the following operation any number of times (possibly, zero):

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    while (t-->0){
	        int n=s.nextInt();
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=s.nextInt();
	        }
	        Set<Integer>st=new HashSet<Integer>();
	        for(int i=0;i<n;i++){
	            if(arr[i]!=0){
	                st.add(arr[i]);
	            }
	        }
	        if(st.size()==1 || st.size()==0){
	            System.out.println("YES");
	        }else{
	            System.out.println("NO");
	        }
	        
	      
	    }

	}

}
