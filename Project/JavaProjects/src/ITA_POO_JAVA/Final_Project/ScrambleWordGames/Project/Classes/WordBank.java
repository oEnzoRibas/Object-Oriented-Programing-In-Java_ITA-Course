package ITA_POO_JAVA.Final_Project.ScrambleWordGames.Project.Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import static ITA_POO_JAVA.Final_Project.ScrambleWordGames.Exceptions.Erros.printERROR;

public class WordBank {
    public static void main(String[] args) {

    //public static String returnWord() {
        File wordFile = new File("Final_Project/ScrambleWordGames/words.txt");
        Scanner file = null;
        int k = 0;
        HashMap<Integer, String> wordsHMap = new HashMap<>();

        try {
            file = new Scanner(wordFile);
        } catch (FileNotFoundException e) {
            printERROR(e);
        }
        try {
            while (file.hasNextLine()) {
                String word = file.nextLine();
                wordsHMap.put(k, word);
                k++;
            }
        } catch (NullPointerException e) {
            printERROR(e);
        }

        Random r = new Random();
        int key = r.nextInt(wordsHMap.size());
        System.out.println(wordsHMap.get((key)));
        System.out.println(key);
        // wordsHMap.forEach((key, val) -> System.out.printf("%s = %s%n", key, val));
        Math.random();
       // return "";
    }
    }


