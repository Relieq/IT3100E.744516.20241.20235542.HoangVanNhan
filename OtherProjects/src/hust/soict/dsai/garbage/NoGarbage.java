package hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        try {
            String filename = "src/hust/soict/dsai/garbage/test.txt"; // Đổi đường dẫn tới file cần đọc
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));

            // Sử dụng StringBuilder
            long startTime = System.currentTimeMillis();
            StringBuilder outputStringBuilder = new StringBuilder();
            for (byte b : inputBytes) {
                outputStringBuilder.append((char) b);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Time with StringBuilder: " + (endTime - startTime) + " ms");

            // Sử dụng StringBuffer
            startTime = System.currentTimeMillis();
            StringBuffer outputStringBuffer = new StringBuffer();
            for (byte b : inputBytes) {
                outputStringBuffer.append((char) b);
            }
            endTime = System.currentTimeMillis();
            System.out.println("Time with StringBuffer: " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
