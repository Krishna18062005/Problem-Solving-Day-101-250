import java.util.*;
public class Hello {
    public static int recursiveSum(int n){
        int s=0;
        while(n!=0){
            s+=n%10;
            n/=10;
        }
        if(s<10) return s;
        return recursiveSum(s);
    }


    public static void main(String[] args) {
		int n=new Scanner(System.in).nextInt();
		System.out.println(recursiveSum(n));
	}
}
