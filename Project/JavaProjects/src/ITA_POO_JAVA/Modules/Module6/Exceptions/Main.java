/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Modules.Module6.Exceptions;

public class Main {
    public static void main(String[] args) throws Exception {
        a(100);

        System.out.println("Terminando execução de main");
    }

    public static void a(int i){
        System.out.println("Running a() as "+i);
        try {
            b(100);
        } catch (Exception e) {
            System.out.println("Treating exception: "+e.getMessage());
        }
        System.out.println("Terminando execução de a()");
    }

    public static void b(int i) throws Exception{
        System.out.println("Running b() as "+i);
        throw new Exception("Exception Message");
    }
}
