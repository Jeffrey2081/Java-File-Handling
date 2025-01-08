import java.util.*;
import java.io.*;

class BinaryFile {
    public static void main(String[] args) throws IOException { // Added arguments for the main method
        Scanner sc = new Scanner(System.in);

        // Get the binary file name
        System.out.print("Enter the name of the binary file: ");
        String fileName = sc.nextLine();
        fileName = fileName + ".dat";

        // Get the number of items
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();

        // Create output streams
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        DataOutputStream dataOPstream = new DataOutputStream(fileOutputStream);

        // Loop to get user input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            int number = sc.nextInt();
            dataOPstream.writeInt(number); // Write number to the binary file
        }

        // Close the streams
        dataOPstream.close();
        fileOutputStream.close();
        sc.close();

        System.out.println("Numbers have been successfully saved to " + fileName);
    }
}
