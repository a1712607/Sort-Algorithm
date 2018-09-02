import java.lang.*;
public class InsertSort {
    public static void Sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (temp < a[j]) 
                    a[j + 1] = a[j];
                
                else 
                    break;
            }
            a[j + 1] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] a = {5, 1, 2, 6, 4, 7, 11, 23, 44, 3, 34};
        Sort(a);
        System.out.print("Insert Sort:");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}