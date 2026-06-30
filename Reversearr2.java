public class Reversearr2{
    public static void main(String[] args){
        int [] nums = {10,20,30,40,20,50,10};
        int n=nums.length;
        boolean flag = false;
        for(int i =n-1;i>=0;i--){
            for(int j =i-1;j>=0;j--){
                if(nums[i] == nums[j]){
                    System.out.println(nums[i]);
                    flag =  true;
                    break;
                }
            }
            if(flag) break;
        }


    }
}