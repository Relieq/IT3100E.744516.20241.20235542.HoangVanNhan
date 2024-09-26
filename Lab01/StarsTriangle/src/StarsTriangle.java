public class StarsTriangle {
    public static void main(String[] args) {
        // Get input from keyboard
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = keyboard.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
