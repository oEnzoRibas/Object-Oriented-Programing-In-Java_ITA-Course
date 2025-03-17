package ITA_POO_JAVA.Final_Project.ScrambleWordGames.Project.Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import static ITA_POO_JAVA.Final_Project.ScrambleWordGames.Exceptions.Erros.printERROR;

public class WordBank {
    File wordFilePath = new File("Final_Project/ScrambleWordGames/words.txt");
    Scanner file = null;
    int k = 0;
    Random r = new Random();
    int key;
    HashMap<Integer, String> wordsHMap = new HashMap<>();

    public WordBank() {
        try {
            this.file = new Scanner(this.wordFilePath);
            while (this.file.hasNextLine()) {
                String word = file.nextLine();
                this.wordsHMap.put(this.k, word);
                this.k++;
            }
        } catch (Exception e) {printERROR(e);}
    }

    public String returnWord() {
        this.key = this.r.nextInt(this.wordsHMap.size());
        // wordsHMap.forEach((key, val) -> System.out.printf("%s = %s%n", key, val));
        return this.wordsHMap.get((this.key));
    }
}


