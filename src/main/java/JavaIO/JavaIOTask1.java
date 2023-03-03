// Java IO - exercise - Task 1

//Create a solution which will display all les/directories included in the provided directory.
package JavaIO;

import java.io.File;

public class JavaIOTask1 {
    public static void main(String[] args) {

        // Creating a File object for a directory
        String path = "C:\\Users\\vikss\\Documents\\GitHub\\Java-Advanced-Features-Exercises";
        File directoryPath = new File(path);

        //List of all the files and directories
        File filesList[] = directoryPath.listFiles();
        System.out.println("The list of all the files/directories in current directory: ");
        for (File file : filesList) {
            System.out.println(file.getName());
        }
    }
}
