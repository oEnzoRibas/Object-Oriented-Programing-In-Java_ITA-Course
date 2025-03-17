package ITA_POO_JAVA.Final_Project.ScrambleWordGames.Errors;

public class Erros {
    public static void printERROR(Exception e){
        System.out.printf("""
                    "ERROR!!! File Not Found!"
                    Cause: %s
                    Message: %s
                    """,e.getCause(),e.getMessage());
    }
}
