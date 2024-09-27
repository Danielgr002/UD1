package Exercici1;

import java.io.File;
import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String fitxer = "a";
        while (!(fitxer.isEmpty())) {
            System.out.print("Dime una ruta: ");
            fitxer = leer.nextLine();
            File archivo = new File(fitxer);
            try {
                mostraInfoRuta(archivo);
            } catch (Exception e){
                System.out.println("Archivo no encontrado");
            }

        }
    }

    public static void mostraInfoRuta(File fitxer) throws Exception{
        if (fitxer.exists()) {
            if (fitxer.isFile()) {
                System.out.println(fitxer.getName());
            }
            if (fitxer.isDirectory()) {
                File[] archivos = fitxer.listFiles();
                for (File ar : archivos) {
                    if (ar.isDirectory()) {
                        System.out.println("[D]" + ar.getName());
                    }
                }
                for (File ar : archivos) {
                    if (ar.isFile()) {
                        System.out.println("[A]" + ar.getName());
                    }
                }
            }
        } else {
            throw new Exception();
        }
    }
}
