import java.util.*;
public class Hello {

    public static void main(String[] args) {
		// Nth - Term Even Prouduct Series;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		long st=1;
		long mly=2;
		while(n-->0){
		    st*=mly;
		    mly++;
		    mly++;
		    if(st>x) st-=x;
		    
		}
		System.out.println(st);

	}
}
