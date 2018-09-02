import java.lang.*;
import java.math.*;
public class SelectSort {
    public static void Sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp_index = i;
            int temp = a[i];

            for (int j = i; j < a.length; j++) {
                if (a[j] < temp) {
                    temp_index = j;
                    temp = a[j];
                }
            }
            
            int temp2 = a[i];
            a[i] = a[temp_index];
            a[temp_index] = temp2;
        }
    }
    
    public static void main(String[] args) {
        int[] a = {5, 1, 2, 6, 4, 7, 11, 23, 44, 3, 34};
        Sort(a);
        System.out.print("Select Sort:");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}