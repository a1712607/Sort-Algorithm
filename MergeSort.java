import java.lang.*;
public class MergeSort {
    public static void main(String[] args) {
        int a[] = { 151, 848, 7, 58, 7, 5, 8, 9, 5, 48, 4, 7, 6, 1, 5, 8 };
        int n = a.length;

        if(n>2) 
            merge(a,0,n-1);
        
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }

    private static void merge(int[] a, int i, int j) {
        if (i != j) {
            int m = i + (j - i) / 2;
            merge(a, i, m);
            merge(a, m + 1, j);
            toOne(a, i, m, j);
        }
    }
    
    private static void toOne(int[] a, int i, int m, int j) {
        int s[]=new int[j-i+1];
        int x=i,y=m+1,k=0;
        while (x <= m && y <= j && k < j - i + 1) {
            if (a[y] < a[x]) {
                s[k] = a[y];
                k++;
                y++;
            }

            else if(a[y] >= a[x]){
                s[k] = a[x];
                k++;
                x++;
            }
        }
        
        if (x > m) {
            while (k < j - i + 1 && y <= j) {
                s[k] = a[y];
                k++;
                y++;
            }
        }
        
        else {
            while (k < j - i + 1 && x <= m) {
                s[k] = a[x];
                k++;
                x++;
            }
        }
        
        for (k = 0; k < j - i + 1; k++) 
            a[i + k] = s[k];
    }
}
