import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
		    int s=sc.nextInt();
		    int k=sc.nextInt();
		    ArrayList<Integer> a=new ArrayList<>();
		    for(int i=0;i<s;i++){
		        a.add(sc.nextInt());
		    }
		    while(k-->0){
		        int su=a.get(0)+a.get(a.size()-1);
		        a.remove(0);
		        a.remove(a.size()-1);
		        a.add(su);
		    }
		    for(int i : a)
		    System.out.print(i+" ");
		    System.out.println();
		}

	}
}
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int d1=a;
		    int d2=b;
		    int c=0;
		    int m=9999;
		    while(!((d1*2<=d2)||(d2*2<=d1))){
		        d1--;
		        c++;
		    }
		    m=c;
		    d1=a;
		    d2=b;
		    c=0;
		    while(!((d1*2<=d2)||(d2*2<=d1))){
		        d2--;
		        c++;
		    }
		    m=Math.min(m,c);
		    d1=a;
		    d2=b;
		    c=0;
		    while(!((d1*2<=d2)||(d2*2<=d1))){
		        d2--;
		        c++;
		    }
		    m=Math.min(m,c);
		    d1=a;
		    d2=b;
		    c=0;
		    while(!((d1*2<=d2)||(d2*2<=d1))){
		        d1++;
		        c++;
		    }
		    m=Math.min(m,c);
		    d1=a;
		    d2=b;
		    c=0;
		    while(!((d1*2<=d2)||(d2*2<=d1))){
		        d2++;
		        c++;
		    }
		    m=Math.min(m,c);
		    System.out.println(m);
		}

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//N Triangle Pattern 
		int size=new Scanner(System.in).nextInt();
		int i=0;
		while(i++<size){
		    printPattern(i);
		}

	}
	public static void printPattern(int n){
	    
	    for(int i=0;i<n*2-1;i++){
	        if(i<n)
	        for(int j=i+1;j>0;j--){
	            System.out.print(j+" ");
	        }
	        else{
	            
	            int re=n*2-i;
	            for(int k=re-1;k>0;k--){
	                System.out.print(k+" ");
	            }
	        }
	        System.out.println("");
	    }
	}
}