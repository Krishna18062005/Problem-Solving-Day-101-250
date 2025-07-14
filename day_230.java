import java.util.*;
public class Hello {
    public static boolean palin(int n){
        StringBuilder str=new StringBuilder(n+"");
        return str.toString().equals(str.reverse().toString());
    }
    public static void main(String[] args) {
		//Next Number Plaindrome
		
		int n=new Scanner(System.in).nextInt()+1;
		while(!palin(n)){
		    n++;
		}
		System.out.println(n);

	}
}
