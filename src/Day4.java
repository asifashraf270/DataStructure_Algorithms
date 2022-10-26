import java.util.EventListener;

public class Day4 {
    public static void main(String[] args){
    int[] input={-1, 2, 3, 0, 3, 2, -1};
        prefixIndex(input);
    }
    public static void prefixIndex(int[] arr){
        int res=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            int prefix_sum=arr[i];
            for (int j=0;j<i;j++){
                prefix_sum+=arr[j];
            }
            int suffix_sum=arr[i];
            for (int j=arr.length-1;j>i;j--){
                suffix_sum+=arr[j];
            }
            if(prefix_sum==suffix_sum){
                System.out.print(i+"....index");
                return;
            }
        }
    }

    public static void prefixSuffix(int[] arr){
        int res=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            int prefix_sum=arr[i];
            for (int j=0;j<i;j++){
                prefix_sum+=arr[j];
            }
            int suffix_sum=arr[i];
            for (int j=arr.length-1;j>i;j--){
                suffix_sum+=arr[j];
            }
            if(prefix_sum==suffix_sum){
                res=Math.max(res,prefix_sum);
            }
        }
        System.out.print(res);
    }

    public static void showOnce(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    System.out.print(arr[i]);
                    return;
                }
            }
        }
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


    public static void showRepeated(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]);
                    return;
                }
            }
        }
    }
}
