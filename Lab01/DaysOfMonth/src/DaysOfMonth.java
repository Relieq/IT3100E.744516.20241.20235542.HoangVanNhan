import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;

        // Nhập năm từ người dùng
        while (true) {
            System.out.print("Enter a year (e.g., 1999): ");
            year = scanner.nextInt();
            if (year >= 0) {
                break;
            } else {
                System.out.println("Please enter a valid non-negative year.");
            }
        }

        // Nhập tháng từ người dùng
        scanner.nextLine(); // Đọc bỏ dòng trống
        while (true) {
            System.out.print("Enter a month (full name, abbreviation, in 3 letters, or in number): ");
            monthInput = scanner.nextLine().toLowerCase();
            // Tính số ngày trong tháng
            int days = getDaysOfMonth(monthInput, year);

            if (days != 0) {
                System.out.println("The number of days in " + monthInput + " " + year + " is: " + days);
                break;
            } else {
                System.out.println("Please enter a valid month.");
            }
        }
    }

    // Kiểm tra xem năm có phải là năm nhuận không
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    // Lấy số ngày trong tháng
    public static int getDaysOfMonth(String month, int year) {
        boolean leapYear = isLeapYear(year);

        switch (month) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 31;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return leapYear ? 29 : 28;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 31;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 30;
            case "may":
            case "5":
                return 31;
            case "june":
            case "jun":
            case "6":
                return 30;
            case "july":
            case "jul":
            case "7":
                return 31;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 31;
            case "september":
            case "sept.":
            case "sep":
            case "9":
                return 30;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 31;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 30;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 31;
            default:
                return 0; // Trả về 0 nếu không hợp lệ
        }
    }
}
