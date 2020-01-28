public class Pairs {
    public static void main(String[] arg) {
        int[] arr1 = new int[]{1, 7, 6, 5, 9};
        int[] arr2 = new int[]{2, 7, 6, 3, 4};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++)
                if (arr1[i] + (arr2[j]) == 13)
                    System.out.println("(" + arr1[i] + "," + arr2[j] + ")");

        }

    }
}





    /*Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        Write a program that will print out all pairs from arrays 1 and 2 that gives a sum of 13:
        Expected output:
        (6,7)

        (9,4)*/