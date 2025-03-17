package ITA_POO_JAVA.Final_Project.ScrambleWordGames.Project.Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import static ITA_POO_JAVA.Final_Project.ScrambleWordGames.Exceptions.Erros.printERROR;

public class WordBank {

    public static String returnWord() {
        File wordFile = new File("Final_Project/ScrambleWordGames/words.txt");
        Scanner file = null;
        int k = 0;
        Random r = new Random();
        int key;
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
        key = r.nextInt(wordsHMap.size());
        // wordsHMap.forEach((key, val) -> System.out.printf("%s = %s%n", key, val));
       return wordsHMap.get((key));
    }
    }


