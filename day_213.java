import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Nth Decimal Place
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int N=sc.nextInt();
		String dc=""+((double)((double)x/(double)y)+"")+"";
		String ans=dc.split("\\.")[1];
		for(int i=ans.length();i<=15;i++) ans+='0';
		System.out.print(ans.charAt(N-1));
	}
}
