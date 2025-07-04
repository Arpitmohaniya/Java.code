public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int T = 3;
        int start = 0;
        int end = arr.length - 1;
        while (start<=end){
            int mid = start + (end -start)/2;
            if (arr[mid] == T){
                System.out.println("Element found at index: " + mid + "  Target number is :" + T);
                return;
            } else if (arr[mid] < T) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Element not found in the array.");
    }  
}
