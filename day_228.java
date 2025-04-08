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
		    int[] freq=new int[1001];
		    int max=0;
		    while(n-->0){
		        freq[sc.nextInt()]++;
		    }
		    for(int i:freq){
		        max=Math.max(i,max);
		    }
		    int c=0;
		    for(int i:freq){
		        if(max==i){
		            c++;
		        }
		    }
		    System.out.println((c==1)?"Yes":"NO");
		    
		}

	}
}
