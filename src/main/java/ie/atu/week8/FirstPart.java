package ie.atu.week8;

import java.io.*;

public class FirstPart {
    public static void main(String[] args) {
        {
            File myFile = new File("myFile.txt");
            System.out.println("My file is located at " + myFile.getAbsolutePath());
        }
    }
}
