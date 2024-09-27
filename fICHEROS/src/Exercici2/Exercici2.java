package Exercici2;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String fitxer = "a";
        while (!(fitxer.isEmpty())) {
            System.out.print("Dime una ruta: ");
            fitxer = leer.nextLine();
            File archivo = new File(fitxer);
            mostraInfoRuta(archivo);
        }
    }

    public static void mostraInfoRuta(File fitxer) {
        if (fitxer.isFile()) {
                System.out.println(fitxer.getName());
        }
        if (fitxer.isDirectory()) {
            File[] archivos = fitxer.listFiles();
            for (File ar : archivos) {
                if (ar.isDirectory()) {
                    File[] directorio;
                        System.out.println("[D]" + ar.getName());
                }
            }
            for (File ar : archivos) {
                if (ar.isFile()) {
                        System.out.println("[A]" + ar.getName());
                }
            }
        }
    }
}
