import java.util.*;

class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int pc=0;

		int ac=0;

		for(int i=0; i<n; i++)
		{
			char ch=sc.next().charAt(0);
			if(ch=='A') {
				ac++;
			}
			else {
				pc++;
			}
			if(n/4<=pc) {
				System.out.print("Not ");
			}
			System.out.println("Blacklisted");
		}
	}
