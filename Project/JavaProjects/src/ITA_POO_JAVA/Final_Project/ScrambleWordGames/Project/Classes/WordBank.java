package ITA_POO_JAVA.Final_Project.ScrambleWordGames.Project.Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import static ITA_POO_JAVA.Final_Project.ScrambleWordGames.Errors.Erros.printERROR;

public class WordBank {
    public static void main(String[] args) {

        Scanner scannerIn = new Scanner(System.in);

        File wordFile = new File("Final_Project/ScrambleWordGames/words.txt");

        HashMap<Integer, String> wordsHMap = new HashMap<>() ;

        Scanner file = null;
        int value = 0;

        try{
            file = new Scanner(wordFile);
        }catch (FileNotFoundException e){printERROR(e);}
        try {
            while (file.hasNextLine()) {
                String word = file.nextLine();
                wordsHMap.put(value, word);
                value++;
            }
        }catch (NullPointerException e){printERROR(e);}
        wordsHMap.forEach((key, val) -> System.out.printf("%s = %s%n", key, val));
        }
    }

