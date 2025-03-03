package Lab001;
import java.util.Arrays;
import java.util.Scanner;
public class lab65_Sort_Calc_Sum_AvgSum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = 0;
        if (sc.hasNextInt()) {
            s = sc.nextInt();
        }

        
        int[] arr = new int[s];
        int sum=0;
        System.out.println(
            "Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
                sum+=arr[i];
            }
        }
        Arrays.sort(arr);
        System.out.println(
            "The elements of the sorted array are: ");
        for (int i = 0; i < s; i++) {
           
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Sum of the array is: "+ sum + "\nAverage value of the array elements is: " + (sum/s));
        sc.close();
    }
}
