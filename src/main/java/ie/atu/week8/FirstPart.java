package ie.atu.week8;
import java.io.*;

public class FirstPart {
    public static void main(String[] args) {
        {
            File myFile = new File("myFile1.txt"); //Creates file and gives it a name
            System.out.println("My file is located at " + myFile.getAbsolutePath()); //File method
            String content = "Details to write";
            try {
                PrintWriter myWriter = new PrintWriter("myFile1.txt");  //Class used to print any form of data
                myWriter.println("Chris");
                myWriter.println("Kath");
                myWriter.println("Jean");
                myWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
