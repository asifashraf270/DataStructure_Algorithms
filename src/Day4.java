import java.util.EventListener;

public class Day4 {
    public static void main(String[] args){

    }

    /*Print Union*/
    public static void printUnion(int[] arr1,int[] arr2){
        int i=0,j=0;
        while (i<arr1.length && i<arr2.length){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                ++i;
            }else if(arr2[j]<arr1[i]){
                System.out.print(arr2[j]+" ");
                j++;
            }else {
                System.out.print(arr2[j]+"");
                i++;
            }
        }
    }
}
