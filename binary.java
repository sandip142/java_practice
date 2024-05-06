public class binary {
    public static void main(String[] args) {
        int brr[] ={1,2,3,4,5,6,7,8,9};
        System.out.println(BinarySearch(brr, 7));
    }
    
    static int BinarySearch(int[] arr, int key) {
        int e = arr.length - 1;
        int s = 0;
        int mid = (e + s) / 2;
        int pos = -1;
        
        while (e >= s) {
            if (key == arr[mid]) {
                pos = mid;
                break; // This break statement is necessary
            } else if (key > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = (e + s) / 2;
        }
        return pos;
    }
}
