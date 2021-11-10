/*
 * program that reads in a text file and counts the frequency of each letter
 * displays the frequencies in descending order
 */

import java.util.*; //needed for Scanner
import java.io.*;  //needed for File related classes
public class LetterCounter {
    public static void main(String args[]) throws IOException{
        Scanner keyboard = new Scanner(System.in); //Scanner to read in file name
        System.out.println("Enter the name of the text file to read:");
        String filename = keyboard.next();

        //This String has all the letters of the alphabet
        //You can use it to "look up" a character using alphabet.indexOf(...) to see what letter it is
        //0 would indicate 'a', 1 for 'b', and so on.  -1 would mean the character is not a letter
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        //TODO: create a way to keep track of the letter counts
        //I recommend an array of 26 int values, one for each letter, so 0 would be for 'a', 1 for 'b', etc.
        int arr [] = new int [26];
        Scanner fileScan = new Scanner(new File(filename));  //another Scanner to open and read the file
        //loop to read file line-by-line
        while (fileScan.hasNext()) {  //this will continue to the end of the file
            String line = fileScan.nextLine();  //get the next line of text and store it in a temporary String
            line = line.toLowerCase( ); // convert to lowercase

            //TODO: count the letters in the current line
            for (int i = 0; i < line.length(); i++) {
                int letters = alphabet.indexOf(line.charAt(i));
                if (letters != -1) {
                    arr[letters]++;
                }
            }
        }
        fileScan.close(); //done with file reading...close the Scanner so the file is "closed"



        //print out frequencies
        System.out.println("Letters - Frequencies in file:");
        //TODO: print out all the letter counts
        for (int i = 0; i < arr.length; i++) {
            System.out.println(alphabet.charAt(i) + " - " + arr[i]);
        }

    }
}