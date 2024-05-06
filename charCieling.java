public class charCieling {
    public static void main(String[] args) {
     char[] letters = {"a","b","c","d"};
    }

    static char Cieling(char[] letters,char target){
        int s=0;
        int e=letters.length-1;
        int mid=(e+s)/2;
        char ans=letters[0];
        while(e>=s){
            if(letters[mid]>target){
                ans=letters[mid];
                e=mid-1;
            }else{
                 s=mid+1;
            }
        mid=(e+s)/2;
        }
        return ans;
    }
}
