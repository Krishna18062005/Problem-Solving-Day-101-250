import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Find AM or PM
		
		String[] st=new Scanner(System.in).next().split(":");
		int hr=Integer.parseInt(st[0]);
		int mn=Integer.parseInt(st[1]);
		if(hr>24||mn>59){
		    System.out.println("INVALIDINPUT");
		}
		else{
		    if(hr==0||hr==24||hr<12){
		        System.out.println("AM");
		    }
		    else{
		        System.out.println("PM");
		    }
		}

	}
}
