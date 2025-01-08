import java.io.*;
import java.util.Scanner;

class BinaryFileReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the file path from the user
        System.out.print("Enter the path of the binary file: ");
        String filePath = sc.nextLine();

        // Read the binary file
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            System.out.println("Reading numbers from the binary file: " + filePath);

            // Read and print the numbers stored in the binary file
            while (dataInputStream.available() > 0) {
                int number = dataInputStream.readInt();
                System.out.println("Read number: " + number);
            }

            // Close the streams
            dataInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        sc.close();
    }
}
