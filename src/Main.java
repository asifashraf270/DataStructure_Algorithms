import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] input={1,2,3};
        System.out.println(findTriplets(input,3));
    }

    public static int binarysearch(int arr[],int n,int k){
        for (int i=0;i<n;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static boolean findTriplets(int[] arr,int n){
        boolean found=false;
        for (int i=0;i<n-1;i++){
            HashSet<Integer> s=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int x=-(arr[i]+arr[j]);
                if(s.contains(x)){
                    found=true;
                }else {
                    s.add(arr[j]);
                }
            }
        }
        return found;
    }



}