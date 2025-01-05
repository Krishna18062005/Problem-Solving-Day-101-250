import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Alphabet Sort Encryption
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String k=sc.nextLine();
		char[] ar=k.toCharArray();
		Arrays.sort(ar);
		int[] ind=new int[k.length()];
		for(int i=0;i<k.length();i++){
		    for(int j=0;j<k.length();j++)
		    if(ar[j]==k.charAt(i))
		    ind[i]=j;
		}
	//	System.out.println(Arrays.toString(ind));
		HashMap<Integer,List<Character>> map=new LinkedHashMap<>();
		int idx=0;
		for(int i=0;i<s.length();i++){
		    
		    idx=(idx)%k.length();
		    int id=ind[idx];
		    
		   // System.out.print(id+" "+s.charAt(i));
		    if(map.containsKey(id+1)){
		        List<Character> lst=map.get(id+1);
		        lst.add(s.charAt(i));
		        map.put(id+1,lst);
		    }
		    else{
		        List<Character> lst=new ArrayList<>();
		        lst.add(s.charAt(i));
		        map.put(id+1,lst);
		    }
		    idx++;
		}
		for(int i=1;i<=k.length();i++){
		    List<Character> ls=map.get(i);
		    for(char j:ls)
		    System.out.print(j);
		}
	//	System.out.println(map);

	}
}
