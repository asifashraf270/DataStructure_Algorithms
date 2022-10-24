import sun.lwawt.macosx.CSystemTray;

import java.util.Arrays;
import java.util.Collections;

public class Day2 {
    public static void main(String[] args){
        int[] input={11,8,5,7,5,100};
        minimumProductK(input,4);
    }
    /*Minimum product of k integers in an array of positive Integers
     */

    public static void minimumProductK(int[] arg,int k){
        Arrays.sort(arg);
        int sum=1;
        for (int i=0;i<k;i++){
            sum=sum*arg[i];
        }
        System.out.print(sum);
    }

    /*Find Mean*/
    public static void findMean(int[] arg){
        int sum=0;
        int mean=0;
        for (int i=0;i<arg.length;i++){
            sum=sum+arg[i];
        }
        mean=sum/arg.length;
        System.out.print(mean+"...mean");
        Arrays.sort(arg);
        if(arg.length%2==0){
            int average=arg[arg.length/2]+arg[(arg.length/2)+1];
            System.out.print(average/2+"//median");

        }
    }
    /*Find all elements in array which have at-least two greater elements
    * */

    public static void twoGreaterElement(int[] arg){
        for (int i=0;i<arg.length;i++){
            int count=0;
            for (int j=0;j<arg.length;j++){
                if(arg[j]>arg[i]){
                    count++;
                }

            }
            if(count>=2){
                System.out.print(arg[i]+"");
                continue;
            }
        }
    }
    /*
    Top 3 values
    * */
    public static void large3(int[] arg){
        int first,second,third;
        first=second=third=Integer.MIN_VALUE;
        for (int i=0;i<arg.length;i++){
            if(arg[i]>first){
                third=second;
                second=first;
                first=arg[i];

            }else if(arg[i]>second){
                third=second;
                second=arg[i];
            }else if(arg[i]>third){
                third=arg[i];
            }
        }
        System.out.print(first+"/"+second+"/"+third);
    }
    public static void largestNo(int[] arg){
        int largeValue=arg[0];
        for (int i=1;i<arg.length;i++){
            if(arg[i]>largeValue){
                largeValue=arg[i];
            }
        }
        System.out.print(largeValue);
    }


    /*K’th Smallest/Largest Element in Unsorted Array | Set 1*/
    public static void kSmallest(int[] arg,int k){
        Arrays.sort(arg);
        System.out.print(arg[k-1]);
    }

    /*k largest(or smallest) elements in an array

     * */

    public static void KlargestNo(int[] arg,int k){
        Arrays.sort(arg);
        for (int i=arg.length-1;i>=arg.length-k;i--){
            System.out.print(arg[i]+" ");
        }
    }
    /*Positive elements at even and negative at odd positions (Relative order not maintained)
     */
    public static void rearrangePositive(int[] arg){
        int positive=0;int neg=1;
        int temp=0;
        while (true){
            while (positive<arg.length && arg[positive]>=0){
                positive+=2;
            }
            while (neg<arg.length && arg[neg]<=0){
                neg+=2;
            }
            if(positive<arg.length && neg<arg.length){
                temp=arg[positive];
                arg[positive]=arg[neg];
                arg[neg]=temp;
            }else {
                break;
            }
        }
        for (int i=0;i<arg.length;i++){
            System.out.print(arg[i]+" ");
        }
    }

    /*Rearrange array such that even index elements are smaller and odd index elements are greater
    * */

    public static void evenOdd(int[] arg){
        int temp=0;
        for (int i=0;i<arg.length;i++){
            if(i%2==0){
                if(i+1<arg.length&&arg[i]>arg[i+1]){
                    temp=arg[i];
                    arg[i]=arg[i+1];
                    arg[i+1]=temp;
                }
            }else {
                if(i+1<arg.length&&arg[i]<arg[i+1]){
                    temp=arg[i];
                    arg[i]=arg[i+1];
                    arg[i+1]=temp;
                }
            }
        }
        for (int i=0;i<arg.length;i++){
            System.out.print(arg[i]+" ");
        }
    }
    /*
    * Move all negative elements to end in order with extra space allowed*/
    public static void moveNegative(int[] arg){
        int[] tempArray=new int[arg.length];
        int count=0;
        for (int i=0;i<arg.length;i++){
            if(arg[i]>0){
                tempArray[count]=arg[i];
                count++;
            }
        }
        for (int i=0;i<arg.length;i++){
            if(arg[i]<0){
                tempArray[count]=arg[i];
                count++;
            }
        }
        for (int i=0;i<arg.length;i++){
            System.out.print(tempArray[i]+" ");
        }
    }
    /*
    * Move all negative numbers to beginning and positive to end with constant extra space*/
    public static void negativeFirstApproach(int[] arg){
        Arrays.sort(arg);
        for (int i=0;i<arg.length;i++){
            System.out.print(arg[i]+" ");
        }
    }

    /*
     * Rearrange an array such that ‘arr[j]’ becomes ‘i’ if ‘arr[i]’ is ‘j’ | Set 1*/

    public static void rearrangeArray(int[] arg){
        int[] temp=new int[arg.length];
        for (int i=0;i<arg.length;i++){
            temp[arg[i]]=arg[i];
        }
        for (int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }



    /*

    * Reorder an array
    * */
    public static void reorderArray(int[] input,int[] indexes){
        int[] temp=new int[input.length];
        for (int i=0;i<indexes.length;i++){
            temp[indexes[i]]=input[i];
        }
        for (int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
  public static void moveZero(int[] arg){
        int count=0;
        for (int i=0;i<arg.length;i++){
            if(arg[i]!=0){
                arg[count]=arg[i];
                count++;
            }
        }
        while (count<arg.length){
            arg[count]=0;
            count++;
        }
        for (int i=0;i<arg.length;i++){
            System.out.print(arg[i]+" ");
        }
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
