import java.util.*;
class Main {
public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
ArrayList<Integer> eve=new ArrayList<>();
int ar[]=new int[n];
  
for(int i=0;i<n;i++) {
ar[i]=sc.nextInt();
if(i%2==0) eve.add(ar[i]);
}
eve.sort(null);
for(int i=0;i<n;i++){
if(i%2==0){
System.out.print(eve.get(i/2)+" ");
}
else System.out.print(ar[i]+" ");
}
}
}
