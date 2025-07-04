public class allPairs {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int T = 7;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] + arr[j] == T){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    } 
}
