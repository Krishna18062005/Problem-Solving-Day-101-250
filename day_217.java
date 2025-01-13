import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Alphabets Range - Circular Fashion
		String ip=new Scanner(System.in).nextLine();
		for(int i=0;i+1<ip.length();i++){
		    for(char j=ip.charAt(i);;j++){
		        System.out.print(j);
		        if(j==ip.charAt(i+1)) break;
		        if(j=='z') j=(char)96;
		    }
		   
		}

	}
}
