import java.lang.*;
public class QuickSort {
    public static void main(String []args){
        int[] test ={ 5,7,4,9,6,3};
        int low = 0;
        int high = test.length-1;
        sort(test,low,high);
        for(int i = 0; i<test.length; i++){
            System.out.print(test[i]+" ");
        }
    }

    private static void sort(int[] test,int low,int high){
        int start = low;
        int end = high;
        int key = test[low];
        
        while(end>start){
            while(end>start && test[end]>=key)  
                end--;
            if(test[end]<=key){
                int temp = test[end];
                test[end] = test[start];
                test[start] = temp;
            }
            
            while(end>start && test[start]<=key)
                start++;
            if(test[start]>=key){
                int temp = test[start];
                test[start] = test[end];
                test[end] = temp;
            }
        }
        
        if(start>low) sort(test,low,start-1);
        if(end<high) sort(test,end+1,high);
    }
}