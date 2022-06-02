import sun.nio.ch.sctp.SctpNet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MainDriver {
    public static void main(String[] args) {
        // Defining the file our information is from in a text file
        File words = new File("src/words.txt");

        try {
            //Reading that information into the Scanner class so we can evaluate each word
            Scanner scanner = new Scanner(words);

            // HashSet for unique set of words meaning there can only be one instance of each word
            HashSet<String> wordStrings = new HashSet<>();
            // As long as the scanner has another value in it, it will continue to loop through trying to add each new word to the HashSet
            while(scanner.hasNext()){
                wordStrings.add(scanner.next());
            }

            // Establish a new ArrayList of Strings to add each word with it's associated count
            List<String> wordCount = new ArrayList<>();
            for(String word:wordStrings){
                // A new scanner to once again iterate through the file
                Scanner countScanner = new Scanner(words);
                // count defined outside of the scope to be later added with the word after iterating through the file
                int count = 0;
                // while countScanner has another value it will conitnue to check if the associate word is equal to the word in the HashSet and add to counter
                while(countScanner.hasNext()){
                    if(countScanner.next().equals(word)){
                        count++;
                    }
                }
                // Finally adds after the counts have been tallied for the word, and continues to repeat until no more words are in our HashSet
                wordCount.add(word + " " + count);
            }

            // Leverages comparator to evaluate how to sort the function. In here we utilize the method comparingInt to take our values as Objects.
            // They are then converted to String and remove all characters that are not numeric. Once completed, it will return the order of those values with
            // their associate values in the wordCount ArrayList that is sorted in descending order thanks to the reversed() method provided by comparator.
            // tha
            Collections.sort(wordCount, Comparator.comparingInt(a -> {
                String b = (String) a;
                return Integer.parseInt(b.replaceAll("\\D+", ""));
            }).reversed());

            // Lastly print out each elment in the wordCount ArrayList
            for(String word:wordCount){
                System.out.println(word);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
