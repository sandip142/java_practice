public class max {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 4, 7, 9, 10, 11, 78, 12};
        System.out.println(maximum(arr));
        System.out.println(secondMaxi(arr));
    }

    static int maximum(int[] arr) {
        int maxi = -9999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }

    static int secondMaxi(int arr[]){
        int maxi = -9999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >maxi&& arr[i]<maximum(arr)) {
                maxi = arr[i];
            }
        }
        return maxi;
    }


}
