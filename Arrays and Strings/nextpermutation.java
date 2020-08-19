
class NextPermutation {
    public void nextPermutation(int[] nums) {
        int k=nums.length-2;
        while(k>=0&&nums[k]>=nums[k+1]){
            --k;
        }   
        if(k==-1){
            reverse(nums,0,nums.length-1);
            return ;

        }
        for(int l=nums.length-1;l>k;--l){
            if(nums[l]>nums[k]){
                int temp=nums[k];
                nums[k]=nums[l];
                nums[l]=temp;
                break;
            }
        }
        reverse(nums,k+1,nums.length-1);

        
    }

    public static void reverse(int [] nums,int start,int end){
        while(start<end){
            int temp =nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
}