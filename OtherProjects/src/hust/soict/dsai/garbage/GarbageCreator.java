package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        try {
            String filename = "src/hust/soict/dsai/garbage/test.txt"; // Đổi đường dẫn tới file cần đọc
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));

            // Sử dụng String và toán tử +
            long startTime = System.currentTimeMillis();

            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char) b;
            }


//            StringBuilder outputStringBuilder = new StringBuilder();
//            for (byte b : inputBytes) {
//                outputStringBuilder.append((char) b);
//            }

            long endTime = System.currentTimeMillis();
            System.out.println("Time with String (+ operator): " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
