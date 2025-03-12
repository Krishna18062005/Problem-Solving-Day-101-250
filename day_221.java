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
		    int[] ar=new int[s];
		    int[] ar2=new int[s];
		    for(int i=0;i<s;i++){
		        ar[i]=sc.nextInt();
		    }
		    for(int i=0;i<s;i++){
		        ar2[i]=sc.nextInt();
		    }
		    boolean p=false;
		    for(int i=0;i<s;i++){
		        int[][] id=new int[s][2];
		        for(int j=0;j<s;j++){
		            id[j][0]=Math.abs(ar[i]-ar[j]);
		            id[j][1]=ar[j];
		        }
		        Arrays.sort(id,(a,b)->{if(a[0]!=b[0]) return a[0]-b[0]; else return a[1]-b[1];});
		       // System.out.println(Arrays.deepToString(id));
		        int c=1;
		        for(int k=0;k<s;k++){
		            if(ar2[k]!=id[k][1]){
		                c=0;
		                break;
		            }
		        }
		        if(c==1){
		            System.out.println(i+1);
		            p=true;
		            break;
		        }
		    }
		    if(!p)
		    System.out.println(-1);
		}

	}
}
