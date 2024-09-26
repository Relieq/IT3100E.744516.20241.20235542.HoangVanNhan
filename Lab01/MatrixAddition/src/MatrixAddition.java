import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows, columns;
        int[][] matrix1, matrix2, sumMatrix;

        // Nhập kích thước ma trận
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        matrix1 = new int[rows][columns];
        matrix2 = new int[rows][columns];
        sumMatrix = new int[rows][columns];

        // Nhập các phần tử cho ma trận 1
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Nhập các phần tử cho ma trận 2
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Thực hiện phép cộng hai ma trận
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Hiển thị ma trận tổng
        System.out.println("The resulting matrix after addition is:");
        printMatrix(sumMatrix, rows, columns, "Sum Matrix:");
    }

    // Hàm in ma trận
    public static void printMatrix(int[][] matrix, int rows, int columns, String matrixName) {
        System.out.println(matrixName);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
