package Tugas;

import java.io.*;
import java.util.Vector;

public class ListOfNumbers2 {
    
    private static final int SIZE = 10;
    private Vector<Integer> victor; 

    public ListOfNumbers2() {
        victor = new Vector<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            victor.addElement(new Integer(i));
        }
    }

    public void writeList() {
        String outFile = "outfile.txt";

        try (PrintWriter out = new PrintWriter(new FileWriter(outFile))) { 
            
            for (int i = 0; i < victor.size(); i++) {
                out.println("Value at: " + i + " = " + victor.elementAt(i));
            }
            
            System.out.println("Successfully wrote to " + outFile);

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public void readList(String fileName) {
        String line = null;
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            
            while ((line = raf.readLine()) != null) {
                try {
                    String parts[] = line.split(" = ");
                    if (parts.length > 1) {
                        Integer i = Integer.parseInt(parts[1].trim());
                        System.out.println("Parsed integer: " + i);
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Warning: Skipping malformed line in file: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file " + fileName + " was not found.");
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ListOfNumbers2 listApp = new ListOfNumbers2();
        
        listApp.writeList(); 
        
        listApp.readList("outfile.txt");
        
        listApp.readList("nonExistentFile.txt");
    }
}