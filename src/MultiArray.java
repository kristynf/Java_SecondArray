public class MultiArray {

    public static void main(String[] args) {

        String[][] data = new String[10][5];

        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 5; column++) {
                data[row][column] = "row" + row + " column" + column + " ";
                System.out.print(data[row][column]);
            }
            System.out.println();


        }

    }

}
/*   Your Assignment:

        Create a multidimensional array in IntelliJ that prints ten rows numbered 1-10 and five columns numbered 1-5. Display them as a matrix as shown below.
        row 0 col 0 row 0 col 1 row 0 col 2 row 0 col 3 row 0 col 4
        row 1 col 0 row 1 col 1 row 1 col 2 row 1 col 3 row 1 col 4
        row 2 col 0 row 2 col 1 row 2 col 2 row 2 col 3 row 2 col 4
        row 3 col 0 row 3 col 1 row 3 col 2 row 3 col 3 row 3 col 4
        row 4 col 0 row 4 col 1 row 4 col 2 row 4 col 3 row 4 col 4
        row 5 col 0 row 5 col 1 row 5 col 2 row 5 col 3 row 5 col 4
        row 6 col 0 row 6 col 1 row 6 col 2 row 6 col 3 row 6 col 4
        row 7 col 0 row 7 col 1 row 7 col 2 row 7 col 3 row 7 col 4
        row 8 col 0 row 8 col 1 row 8 col 2 row 8 col 3 row 8 col 4
        row 9 col 0 row 9 col 1 row 9 col 2 row 9 col 3 row 9 col 4*/
