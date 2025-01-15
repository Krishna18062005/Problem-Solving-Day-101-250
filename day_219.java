import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Previous Line Expansion Pattern
		
		int n=new Scanner(System.in).nextInt();
		String prev="";
		for(int i = 0 ; i < n ; i++){
		    System.out.println(prev+""+(char)(i+'A')+prev);
		    prev=prev+""+(char)(i+'A')+prev;
		}

	}
}
