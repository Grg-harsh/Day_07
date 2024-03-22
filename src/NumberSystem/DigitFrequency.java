package NumberSystem;
import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the digit");
        int k = scn.nextInt();
        freqency(arr, k);
    }
    public static void freqency(int arr[],int k){
        int digit = 0;
       for(int i = 0; i < arr.length; i++){
           if(arr[i] == k){
               digit++;
           }
       }
        System.out.println(digit);
    }
}
