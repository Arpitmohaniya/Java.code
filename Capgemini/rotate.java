public class rotate {
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
    
}
