

public class Cieling {
    public static void main(String[] args) {

        int arr[]={2,3,5,9,14,16,18};
        System.out.println(findCieling(arr, 15));
        System.out.println(findFloor(arr, 15));
        
    }

    static int findCieling(int arr[],int target)
    {
        int s =0;
        int  e=arr.length-1;
        int mid=(e+s)/2;
        int ans=-1;
        while(e>=s){
            if(arr[mid]==target)
            {
                ans=arr[mid];
                break;
            }
            else if(arr[mid]>target){
                ans=arr[mid];
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid= (e+s)/2;
        }
        return ans;
    }

    static int findFloor(int arr[],int target)
    {
        int s =0;
        int  e=arr.length-1;
        int mid=(e+s)/2;
        int ans=-1;
        while(e>=s){
            if(arr[mid]==target)
            {
                ans=arr[mid];
                break;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                ans=arr[mid];
                s=mid+1;
            }
            mid= (e+s)/2;
        }
        return ans;
    }
}
