public class Day3 {
    /*Find k pairs with smallest sums in two arrays
     */


    public static void main(String [] args){
        int[] input={0,1,2,6,9};
        findMissingElement(input,5,10);
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
