public class twoPointer {
    public static void main(String[] args){
        int nums[] = {1,8,6,2,5,4,8,3,7};
        int maxArea =0;
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int curretArea = Math.min(nums[start], nums[end]) * (end - start);
            maxArea = Math.max(maxArea, curretArea);
            if (nums[start] < nums[end]){
                start++;
            }else{
                end--;
            }
        }
        System.out.println(" the maximum amount of water a container can store "+maxArea);
    }
}
