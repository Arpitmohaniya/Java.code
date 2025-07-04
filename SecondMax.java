class SecondMax{
    public static void main(String[] args) {
        int arr[] = {4,15,12,-7,-8};
        int max = arr[0];
        int SecondMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                SecondMax = max;
                max = arr[i];
            } else if (arr[i] > SecondMax && arr[i] != max) {
                SecondMax = arr[i];
            }
        }
        System.out.println("The second maximum number is: " + SecondMax);
    }
}