class Solution {
    public static void main(String args[]){
        int[] nums={1,3,1,4,1,3,2};
        int[] queries={0,3,5};
        Solution obj=new Solution();
        System.out.print(obj.solveQueries(nums,queries));
    }
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                ArrayList<Integer> ar=map.get(nums[i]);
                ar.add(i);
                map.put(nums[i],ar);
            }
            else{
                ArrayList<Integer> ar=new ArrayList<>();
                ar.add(i);
                map.put(nums[i],ar);
            }
        }
        
        List<Integer> ans=new ArrayList<>();
        for(int i:queries){
            int a=nums[i];
            ArrayList<Integer> ar=map.get(a);
            if(ar.size()==1) ans.add(-1);
            else
            ans.add(task(i,ar,nums.length));
        }
        
        return ans;
    }
    public static int task(int ii,ArrayList<Integer> ls,int n){
        int i=0;
        int j=ls.size()-1;
        int ans=-1;
        while(i<=j){
            
            int mid=(i+j)/2;
           
            if((int)ls.get(mid)==ii){
                ans=mid;
                break;
            }
            else if(ls.get(mid)>ii){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
         
      
        int k=ls.size();
        int kk=(ans-1)%k;
        if(kk==-1){
            kk=k-1;
        }
            int a=Math.min(Math.abs(ls.get(ans)-ls.get(kk)),Math.abs(ls.get((ans+1)%k)-ls.get(ans)));
            
            int b=Math.min(n-Math.abs(ls.get(ans)-ls.get(kk)),n-Math.abs(ls.get((ans+1)%k)-ls.get(ans)));
            
            ans=Math.min(a,b);
       
       
       
        return ans;

    }
}
