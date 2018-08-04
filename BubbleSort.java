import java.lang.*;
import static java.lang.System.out;

public class BubbleSort {
    public static int[] bubble_sort(int[] input) {
        for (int i = 0; i < input.length-1; i++){
            for(int j=i+1;j< input.length;j++){
                if (input[j] < input[i]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
       
        
    }
}
