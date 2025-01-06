import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Integer - Max factor Count 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int maxe=0;
		int maxf=0;
		for(int i=0;i<n;i++){
		    int num=sc.nextInt();
		    int fc=0;
		    for(int j=1;j<=num;j++){
		        if(num%j==0) fc++;
		    }
		    if(fc>maxf){
		        maxf=fc;
		        maxe=num;
		    }
		}
		System.out.print(maxe+" "+maxf);

	}
}
