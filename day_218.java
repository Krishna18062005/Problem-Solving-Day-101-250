import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Same position - Upper Case 
		Scanner sc=new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		for(int i = 0 ; i < s2.length(); i ++ ){
		    if(s2.charAt(i)<='Z'&&s2.charAt(i)>='A'){
		        System.out.print(s1.charAt(i));
		    }
		}
		for(int i = 0 ; i < s1.length(); i ++){
		    if(s1.charAt(i)<='Z'&&s1.charAt(i)>='A'){
		        System.out.print(s2.charAt(i));
		    }
		}

	}
}
