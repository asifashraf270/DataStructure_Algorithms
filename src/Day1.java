public class Day1 {

public static void  main(String[] args){
    int[] input={1,2,3,4,5};
    reverseString("hello");
}

public static void rearranceOrder(int[] arr){
    int[] positiveArray=new int[arr.length];

}
    public static void rotateArry(int[] arr,int d){
        int p=0;
        while (p<d){
            int temp=arr[0];
            for (int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
            p++;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    public static void searchValue(int[] arr,int key){
        int value=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==key){
                value=i;
            }
        }
        System.out.println(value);
    }

    public static void searchPair(int[] arr,int sum){
        boolean result=false;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    result=true;
                }
            }
        }
        System.out.println(result);
    }

    public static void maximumSum(int[] arr){
        int p=0;
        int result=0;

        while (p<arr.length){
        int sum=0;
        int temp=arr[0];
        for (int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
            sum=sum+(arr[i]*i);
        }
        arr[arr.length-1]=temp;
        sum=sum+(temp*(arr.length-1));
        if(sum>=result){
            result=sum;
        }
        p++;
    }
    System.out.println(result);
    }

    public static void rotationCount(int[] arr){
        int minimumValue=arr[0];
        int count=0;
        for (int i=1;i<arr.length;i++){
            if(arr[i]<minimumValue){
                minimumValue=arr[i];
                count=i;
            }
        }
        System.out.println(count);
    }

    public static void multipleLeftRotation(int[] arr,int k){
        int p=0;

        while (p<k){
            int temp=arr[0];
            for (int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];

            }
            arr[arr.length-1]=temp;
            p++;

        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void minimumElement(int[] arr){
    int minimum=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]<minimum){
            minimum=arr[i];
        }
    }
    System.out.println(minimum);
    }


    public static void rightRotationPoint(int[] arr,int k){
    int p=0;
    while (p<k){
        int temp=arr[arr.length-1];
        for (int i=arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        p++;
    }
    for (int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }

    public static void hammingDistance(int[] arr){
        int[] newArray=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            newArray[i]=arr[i];
        }
        int p=0;
        int result=0;
        int count=0;
        while (p<newArray.length-1){
            count=0;
            int temp=newArray[0];
            for (int i=0;i<arr.length-1;i++){
                newArray[i]=newArray[i+1];
            }
            newArray[newArray.length-1]=temp;
            p++;
            for (int i=0;i<arr.length;i++){
               if(arr[i]!=newArray[i]){
                   count++;
               }
            }
            if(result<count){
               result=count;
            }
        }
        System.out.println(result);
    }

    public static void reverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        int temp;
        while (start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void reverseString(String input){
    int start=0;
    char[] string=input.toCharArray();
    int end=input.length()-1;
    while (start<end){
        char temp=input.charAt(start);
        string[start]=string[end];
        string[end]=temp;
        start++;
        end--;
    }
    System.out.println(String.valueOf(string));
    }

}
