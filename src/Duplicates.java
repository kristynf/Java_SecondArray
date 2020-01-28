
import java.util.Scanner;

public class Duplicates {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int[] value = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter 10 values: ");
            value[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(value[i]);
        }
        for (int i = 0; i < value.length; i++) {
            for (int k = i + 1; k < value.length; k++) {
                if (value[i] == value[k]) {
                    value[i] = 0;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (value[i] != 0) {
                System.out.println(value[i]);
            }
        }


    }
}

//Prompt the user to input 10 values and store them into an array. If there are any duplicate values in that array, remove them and print out the remaining values.