public class Day3 {
    /*Find k pairs with smallest sums in two arrays
     */


    public static void main(String [] args){
        int[] input={1,2,3,4,5,6,7,8,9,10};
        deleteIndex(input,5);
    }
    public static void deleteIndex(int[] input,int index){
        for (int i=index;i<input.length-1;i++){
            input[i]=input[i+1];
        }
        for (int i=0;i<input.length-1;i++){
            System.out.print(input[i]+" ");
        }
    }
    public static void insertAnyPosition(int[] input,int value,int index){
        for (int i=input.length-1;i>index;i--){
            input[i]=input[i-1];
        }
        input[index]=value;
        for (int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
    }


    public static void insertOperation(int[] arr,int value){
        arr[arr.length]=value;
        System.out.print(arr.length);
    }
        public static void findElement(int[] input,int k){
            for (int i=0;i<input.length;i++){
                if(input[i]==k){
                    System.out.print(i+"");
                    return;
                }
            }
        }

    public static void secondSmallest(int [] args){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for (int i=0;i<args.length;i++){
            if(args[i]<smallest){
                smallest=args[i];
            }
        }
        for (int i=0;i<args.length;i++){
            if(args[i]<secondSmallest &&smallest<args[i]){
                secondSmallest=args[i];
            }
        }
        System.out.print(smallest+" "+secondSmallest);
    }

    public static void findMissingElement(int[] input,int n,int m){
        for (int i=0;i<m;i++){
            if(input[i]!=i){
                System.out.print(i);
                break;
            }
        }
    }


}
