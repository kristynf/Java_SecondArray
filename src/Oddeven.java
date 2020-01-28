import java.util.Scanner;

public class Oddeven {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int[] value = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter 10 values: ");
            value[i] = sc.nextInt();
            sc.nextLine();
        }

        int evenCount = 0, oddCount = 0;
        for (int i : value) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("\n Total Number of Even Numbers in this Array = " + evenCount);
        System.out.println("\n Total Number of Odd  Numbers in this Array = " + oddCount);
    }


}


//       Prompt the user to input 10 values and store them into an array. Output the total number of odd and even values in the array.