package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class OperatingFile {

    // Creating File
    void createFile(String fileName, String data) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(data);
            // System.out.println(obj.getName() + " created");
            fileWriter.close();

        } catch (Exception e) {
            System.out.println("Somethin went wrong " + e.getMessage());
        }

    }

    String read(String fileName) {

        try {
            String fileData = "";
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
                fileData += data;
            }
            sc.close();
            return fileData;
        } catch (Exception e) {
            System.out.println("Somethin went wrong " + e.getMessage());
            return "";

        }

    }

    void delete(String fileName) {
        try {
            if (new File(fileName).delete()) {
                System.out.println("File Deleted!");

            } else {
                System.out.println("Error in deleting File");
            }
        } catch (Exception e) {
            System.out.println("Somethin went wrong " + e.getMessage());
        }

    }

    void update(String fileName, OperatingFile operatingFile, String data) {
        try {
            String previousData = operatingFile.read(fileName);
            operatingFile.createFile(fileName, previousData + "\n" + data);
        } catch (Exception e) {
            System.out.println("Somethin went wrong " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        OperatingFile operatingFile = new OperatingFile();
        String fileName = "Abc.txt";
        operatingFile.createFile(fileName, "Writing in a File");
        operatingFile.update(fileName, operatingFile, "new Updated Data");
        operatingFile.read(fileName);
        operatingFile.delete(fileName);
        operatingFile.read(fileName);

    }
}
