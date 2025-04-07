import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        HashMap<Integer,Integer> map=new HashMap<>();
	        int max=1;
	        for(int i=0;i<n;i++){
	            int nu=sc.nextInt();
	            
	            if(map.containsKey(nu)){
	                map.put(nu,map.get(nu)+1);
	                max=Math.max(max,map.get(nu));
	            }
	            else{
	                map.put(nu,1);
	            }
	        }
	        System.out.println(n-max);
	    }
	}
}
