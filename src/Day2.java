import java.util.Arrays;

public class Day2 {
    public static void main(String[] args){
        int[] input={2,2,0,4,0,8};
        doubleFirstElement(input);
    }


/*  First Element Double*/
    public static void doubleFirstElement(int[] arg){
        for (int i=0;i<arg.length;i++){
            if(i<arg.length-1){
                if(arg[i]==arg[i+1]){
                    arg[i]=arg[i]*2;
                    arg[i+1]=0;
                }
            }
        }

    }

    /*First negative Number than positive no*/
    public static void rearrange(int[] arg){
        int temp=0;
        for (int i=0;i<arg.length;i++){
           for (int j=i+1;j<arg.length;j++){
               if(arg[j]<0){
                   temp=arg[j];
                   arg[j]=arg[i];
                   arg[i]=temp;
               }
           }
        }
        for (int i=0;i<arg.length;i++){
            System.out.print(arg[i]+" ");
        }
    }

    public static void postiveRearrange(int[] arg){
        int temp=0;
        for (int i=0;i<arg.length;i++){
            for (int j=i+1;j<arg.length;j++){
                if(arg[j]>0){
                    temp=arg[j];
                    arg[j]=arg[i];
                    arg[i]=temp;
                }
            }
        }

        for (int i=0;i<arg.length;i++){
            System.out.print(arg[i]+" ");
        }
    }
    public static void evenOddRearrange(int[] arg){
        int temp=0;
        for (int i=0;i<arg.length;i++){
            if(i<arg.length && (i+1)%2==0){
                //even
                if(arg[i]<arg[i-1]){
                    temp=arg[i];
                    arg[i]=arg[i-1];
                    arg[i-1]=temp;
                }
            }else {
                //odd
                if(i+1<arg.length && arg[i]>arg[i+1]){
                    temp=arg[i];
                    arg[i]=arg[i+1];
                    arg[i+1]=temp;
                }
            }
        }
        for (int i=0;i<arg.length;i++){
            System.out.print(arg[i]+ "");
        }
    }
    public static void evenOddReverse(int[] args){
        int temp=0;
        for (int i=0;i<args.length;i++){
            if(i<args.length && (i+1)%2==0){
                //even
                if(args[i]>args[i-1]){
                    temp=args[i];
                    args[i]=args[i-1];
                    args[i-1]=temp;
                }
            }
            else {
                //odd
                if(i+1< args.length){
                    if(args[i]>args[i+1]){
                        temp=args[i];
                        args[i]=args[i+1];
                        args[i+1]=temp;
                    }
                }
            }
        }
        for (int i=0;i<args.length;i++){
            System.out.print(args[i]+" ");
        }
    }

    //Array Rearrangement highest smallest
    public static void rearrangementHighest(int[] args){
        int[] temperatoryArray=new int[args.length];
        int start=0;
        int end=args.length-1;
        int loopCount=0;
        Arrays.sort(args );
        while (start<end){
            temperatoryArray[loopCount]=args[end];
            loopCount++;
            end--;
            temperatoryArray[loopCount]=args[start];
            start++;
            loopCount++;
        }
        for (int i=0;i<args.length;i++){
            System.out.print(temperatoryArray[i]+" ");
        }
    }
}
