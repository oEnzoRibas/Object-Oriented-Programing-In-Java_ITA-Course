package ITA_POO_JAVA.Final_Project.ScrambleWordGames.Exceptions;

public class Erros {
    public static void printERROR(Exception e){
        System.out.printf("""
                    "ERROR!!!"
                    Cause: %s
                    Message: %s
                    """,e.getCause(),e.getMessage());
    }
}
