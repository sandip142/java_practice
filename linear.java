public class linear {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,15,11,34,21,10,22};
        
        System.out.println(LinearSearch(arr,21));
    
        
    }

    static int LinearSearch(int[] arr,int key)
    {
        int pos=-1;
        for(int i=0;i<arr.length;i++){
            
           if(key==arr[i]){
            pos=i;
           }
        }
        return pos;
    }

   
}
