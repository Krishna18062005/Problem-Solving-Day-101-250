import java.util.*;
public class Hello {

    public static void main(String[] Kaidrix) {
		// Two Teams - Find the Winner-
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t1=0;
		int t2=0;
		int t1s=0;
		int t2s=0;
		for(;n>0;n--){
		    int f=sc.nextInt();
		    int s=sc.nextInt();
		    t1s+=f;
		    t2s+=s;
		    if(f==s) continue;
		    else if(f<s) t2++;
		    else if(f>s) t1++;
		}
		String ans="TIE";
		if(t1>t2) ans="Team A";
		else if(t2>t1) ans="Team B";
		else{
		    if(t1s<t2s){
		      ans="Team B";   
		    }
		    else if(t2s<t1s){
		        ans="Team A";
		    }
		}
		System.out.print(ans);

	}
}
