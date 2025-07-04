public class Subarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4,}; 
        int max =0;
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);

            // int sum =0;
            // for(int j=i;j<arr.length;j++){
            //     // for(int k=i;k<=j;k++){
            //     //     // System.out.print(arr[k]+" ");
            //     //     // sum += arr[k];
            //     // }
            //     // sum += arr[j];
            //     // if ( sum > max){
            //     //     max =sum;
            //     }
                // System.out.println(" sum" +sum);
            }
                System.out.println("the maximum subarry is:" + max);
        }
        // System.out.println("the sum of maximum subarry is:" + max);
    }   

