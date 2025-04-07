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
		    int ans=0;
		    while(n-->0){
		        ans^=(sc.nextInt());
		    }
		    System.out.println(ans);
		}

	}
}
