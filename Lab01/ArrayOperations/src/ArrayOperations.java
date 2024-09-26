import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array;

        // Nhập mảng từ người dùng
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        array = new int[size];

        // Nhập các phần tử của mảng
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Sắp xếp mảng
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Tính tổng các phần tử trong mảng
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Tính giá trị trung bình
        double average = (double) sum / array.length;

        // Hiển thị kết quả
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);
    }
}
