package ie.atu.week8;

import java.io.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        System.out.println("Enter file name: ");
        Scanner fileNameScanner = new Scanner( System.in );
        String fileName = "";

        if ( fileNameScanner .hasNext() ) {
            fileName = fileNameScanner.next();
        }
        Scanner inputFile = null;
        String content = "Details to write";

        try {
            PrintWriter myWriter = new PrintWriter(fileName);  //Class used to print any form of data
            myWriter.println("Yes");
            myWriter.println("It");
            myWriter.println("Works");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}